## decorator 场景说明

IStream 接口规范了一些对文件的一些操作，可以向文件中操作（FileStream）、内存中的文件操作（MemoryStream）,
网络的文件操作（NetworkStream），当后来新增了加密操作，旧的方式是直接继承原来的类，执行加密操作，
 如 `CryptoFileStream` 继承 `FileStream`，然后在  `CryptoFileStream` 中执行加密操作，调用父类
 `FileStream` 的方法完成读写，如果要新增对文件缓存操作，那么又要新增三个类

这样的后果是重复代码太多，且定义类太多

可以使用装饰者模式，定义 `CryptoStream` 类实现 `IStream` 接口，拥有成员变量 `IStream stream`，在此类中执行加密，
然后调用 `stream.xxx` 的方法，就可以在运行的时候，去调用对应类的方法，当后面新增需求，需要对文件操作增加缓存时，新增
一个 `BufferedStream` 就能实现

所以只要实现了某个接口，类成员变量中又有此接口的变量，那么很可能是装饰模式

因为此时每新增一个如 `BufferedStream` 这样的类，里面都有一个 `IStream` 成员变量，所以可以把它单独提出来，
也就是 new2 中的 `DecoratorStream`，此后新增操作，直接继承 `DecoratorStream`，这样和 Java 中的 io 操作
类很像

