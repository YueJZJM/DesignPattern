package abstract_factory.old;

import abstract_factory.old.sql.SqlCommand;
import abstract_factory.old.sql.SqlConnection;
import abstract_factory.old.sql.SqlDataReader;

public class EmployeeDAO {
    public void getEmployees() {
        SqlConnection connection = new SqlConnection();
        connection.connectionString("...");

        SqlCommand command = new SqlCommand();
        command.commandText("...");
        command.setConnection(connection);

        SqlDataReader reader = command.executeReader();

        //读取数据
        //...

    }
}
