package abstract_factory.new1.factory;

import abstract_factory.new1.base_interface.IDBConnection;
import abstract_factory.new1.factory.factory_interface.IDBConnectionFactory;
import abstract_factory.new1.imp.sql_server.SqlConnection;

public class SqlConnectionFactory implements IDBConnectionFactory {

    public IDBConnection createDBConnection() {
        return new SqlConnection();
    }
}
