package abstract_factory.new1.factory;

import abstract_factory.new1.base_interface.IDataReader;
import abstract_factory.new1.factory.factory_interface.IDataReaderFactory;
import abstract_factory.new1.imp.sql_server.SqlDataReader;

public class SqlDataReaderFactory implements IDataReaderFactory {
    public IDataReader createDataReader() {
        return new SqlDataReader();
    }
}
