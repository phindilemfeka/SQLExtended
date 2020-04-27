import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        final String driver = "org.postgresql.Driver";

        try {
            //register PostgresSQL jdbc driver
            Class.forName(driver);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
            return;
        }
        System.out.println("Driver registered successfully");

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }

        SQLExtended.sql1();
        SQLExtended.sql2();
        SQLExtended.sql3();
        SQLExtended.sql4();
        SQLExtended.sql5();
        SQLExtended.sql6();
        SQLExtended.sql7();

    }

}
