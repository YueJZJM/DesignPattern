package abstract_factory.new2.factory;

import abstract_factory.new2.base_interface.IDBCommand;
import abstract_factory.new2.base_interface.IDBConnection;
import abstract_factory.new2.base_interface.IDataReader;

public interface IDBFactory {
    IDBCommand createDBCommand();

    IDataReader createDataReader();

    IDBConnection createDBConnection();
}
