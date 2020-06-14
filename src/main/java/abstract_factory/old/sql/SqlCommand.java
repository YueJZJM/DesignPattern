package abstract_factory.old.sql;

public class SqlCommand {
    public void commandText(String value) {

    }

    public void setConnection(SqlConnection connection) {

    }

    public SqlDataReader executeReader() {
        return new SqlDataReader();
    }
}
