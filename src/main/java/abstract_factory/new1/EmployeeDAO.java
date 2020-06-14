package abstract_factory.new1;

import abstract_factory.new1.base_interface.IDBCommand;
import abstract_factory.new1.base_interface.IDBConnection;
import abstract_factory.new1.base_interface.IDataReader;
import abstract_factory.new1.factory.factory_interface.IDBCommandFactory;
import abstract_factory.new1.factory.factory_interface.IDBConnectionFactory;
import abstract_factory.new1.factory.factory_interface.IDataReaderFactory;
import abstract_factory.old.sql.SqlDataReader;

public class EmployeeDAO {

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
