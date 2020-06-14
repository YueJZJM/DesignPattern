package abstract_factory.new1.factory;

import abstract_factory.new1.base_interface.IDBCommand;
import abstract_factory.new1.factory.factory_interface.IDBCommandFactory;
import abstract_factory.new1.imp.sql_server.SqlCommand;

public class SqlCommandFactory implements IDBCommandFactory {
    public IDBCommand createDBCommand() {
        return new SqlCommand();
    }
}
