package abstract_factory.new2.factory;

import abstract_factory.new2.base_interface.IDBCommand;
import abstract_factory.new2.base_interface.IDBConnection;
import abstract_factory.new2.base_interface.IDataReader;
import abstract_factory.new2.sql_server.SqlCommand;
import abstract_factory.new2.sql_server.SqlConnection;
import abstract_factory.new2.sql_server.SqlDataReader;

public class SqlDBFactory implements IDBFactory {
    public IDBCommand createDBCommand() {
        return new SqlCommand();
    }

    public IDataReader createDataReader() {
        return new SqlDataReader();
    }

    public IDBConnection createDBConnection() {
        return new SqlConnection();
    }
}
