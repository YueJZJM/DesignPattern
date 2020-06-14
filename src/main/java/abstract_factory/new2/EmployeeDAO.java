package abstract_factory.new2;

import abstract_factory.new2.base_interface.IDBCommand;
import abstract_factory.new2.base_interface.IDBConnection;
import abstract_factory.new2.factory.IDBFactory;

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
