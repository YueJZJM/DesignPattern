package abstract_factory.new1.factory.factory_interface;

import abstract_factory.new1.base_interface.IDBConnection;

public interface IDBConnectionFactory {
    public IDBConnection createDBConnection();
}
