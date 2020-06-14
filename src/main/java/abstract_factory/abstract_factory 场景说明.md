# abstract factory 场景说明

## 对应 old 中代码

存在操作 sql server 数据库的操作，在 `EmployeeDAO` 中，会用 `SqlConnection` 先和数据库建立连接，
`SqlCommand` 写 sql 语句查询，`SqlDataReader` 获取结果等操作。

但是后面想支持 MySQL、Oracle 的数据库，那么用 new 创建就不合适了，可以想到用面向接口来做

## 对应 new1 中代码

首先会将所有的功能抽象为接口，`IDBConnection` 表示数据库的连接，`IDBCommand` 表示数据库的 sql 语句，
`IDBReader` 表示结果的读取，当然里面会有对应的函数（此处省略了），接着利用工厂模式创建对象，首先会创建
出一个工厂的接口，如 `IDataReaderFactory`，里面的函数 `createDataReader` 返回 `IDataReader` 对象，
`SqlDataReaderFactory` 表示 sql server 数据库的操作，所以需要实现此接口，返回 `SqlDataReader` 对象

在操作时，就完全避免了 new 的操作

```java
public class EmployeeDAO {

    // 以下三个变量需要通过构造函数传入，此处省略
    IDBCommandFactory mCommandFactory;
    IDBConnectionFactory mConnectionFactory;
    IDataReaderFactory mReaderFactory;

    public void getEmployees() {
        IDBConnection connection =
                mConnectionFactory.createDBConnection();

        //connection.connectionString("...");

        IDBCommand command =
                mCommandFactory.createDBCommand();

//        command.commandText("...");
//        command.setConnection(connection);

//        IDataReader reader = command.executeReader();

        //读取数据
        //...
    }
}
```

但是此处还有个问题，sql server 的 connection 只能和 sql server 的 command 一起工作，不能 oracle 的
command 一起工作，此处的写法会导致对象传入错误程序出现问题

## 对应 new2 中代码

优化是把这三个对象用一个工厂接口管理，此处定义了 `IDBFactory` 接口，里面实现了 `IDBCommand createDBCommand` 等
这样的方法，在让具体的类实现此接口，如要创建 sql server 的类，就创建 `SqlDBFactory` 并返回 sql server 具体
的实现类

此时调用者就能用下面的代码实现数据库的操作，避免 new1 中的问题

```java
public class EmployeeDAO {

    IDBFactory mIDBFactory;

    public EmployeeDAO(IDBFactory factory) {
        this.mIDBFactory = factory;
    }

    public void getEmployees() {
        IDBConnection connection = mIDBFactory.createDBConnection();
        //connection.connectionString("...");

        IDBCommand command =
                mIDBFactory.createDBCommand();

//        command.commandText("...");
//        command.setConnection(connection);

//        IDataReader reader = command.executeReader();

        //读取数据
        //...
    }
}
```