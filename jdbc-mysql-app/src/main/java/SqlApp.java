
import java.sql.*;

//Enviromental Variables
public class SqlApp {
    public static void main(String[] args) {
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USR");
        //String user = "root";
        String password = "yearup";


    try {
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM vehicles;");

        ResultSet resultSet = statement.getResultSet();

        while( resultSet.next()) {
           // String make = resultSet.getString("make");
          //  String model = resultSet.getString("MODEL");
          //  double price = resultSet.getDouble("price");
            System.out.println(resultSet.getString("make"));

        }

        } catch (SQLException e) {
        System.out.println("Didn't work");
    }


    }




}
