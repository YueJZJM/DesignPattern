package abstract_factory.new2.factory;

import abstract_factory.new2.base_interface.IDBCommand;
import abstract_factory.new2.base_interface.IDBConnection;
import abstract_factory.new2.base_interface.IDataReader;
import abstract_factory.new2.oracle.OracleCommand;
import abstract_factory.new2.oracle.OracleConnection;
import abstract_factory.new2.oracle.OracleDataReader;

public class OracleDBFactory implements IDBFactory {
    public IDBCommand createDBCommand() {
        return new OracleCommand();
    }

    public IDataReader createDataReader() {
        return new OracleDataReader();
    }

    public IDBConnection createDBConnection() {
        return new OracleConnection();
    }
}
