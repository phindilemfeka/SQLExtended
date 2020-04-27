import java.sql.*;

public class SQLExtended {

    public static void sql1() throws SQLException {

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

        ResultSet results;
        String query1 = "SELECT * FROM customers";
        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query1);

        try {
          results = ps.executeQuery();
           while (results.next()){
               String getResult = results.getString("1. ");
               System.out.println(getResult);
           }

           connect.close();
           results.close();


        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }


    public static void sql2() throws SQLException {

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }


        String query1 ="SELECT FirstName FROM customers";

        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query1);

        try {
            ResultSet results;
            results = connect.createStatement().executeQuery(query1);
            while (results.next()){
                String getResult = results.getString("2. ");
                System.out.println(getResult);
            }

        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }
    public static void sql3() throws SQLException {

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }


        String query3 ="SELECT FirstName FROM customers WHERE customerid =1";
        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query3);

        try {
            ResultSet results;
            results = ps.executeQuery();
            while (results.next()){
                String getResult = results.getString("3. ");
                System.out.println(getResult);
            }


        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }


    public static void sql4() throws SQLException {

        Connection connect = null;

        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }

        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }


        String query4 ="UPDATE FROM customers " +
                        "SET FirstName = Lerato Mabitso" +
                        "WHERE customerid = 1";

        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query4);

        try {
            ResultSet results;
            results = ps.executeQuery();

            while (results.next()){
                String getResult = results.getString("4. ");
                System.out.println(getResult);
            }

        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }

    public static void sql5() throws SQLException {

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }

        String query5 ="DELETE (*) FROM customers" +
                       "WHERE customerid = 2";

        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query5);

        try {
            ResultSet results;
            results = ps.executeQuery();
            while (results.next()){
                String getResult = results.getString("5. ");
                System.out.println(getResult);
            }

            connect.close();
            results.close();


        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }
    public static void sql6() throws SQLException {

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }


        String query6 ="SELECT DISTINCT status FROM orders";
        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query6);

        try {
            ResultSet results;
            results = connect.createStatement().executeQuery(query6);
            while (results.next()){
                String getResult = results.getString("6. ");
                System.out.println(getResult);
            }

            connect.close();
            results.close();


        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }
    public static void sql7() throws SQLException {

        Connection connect = null;
        try {
            //Creating connection ("jdbc:postgresql"//hostname:port/dbname","username","password");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi","posttgres","Tuks@2018");
        }
        catch (SQLException e) {
            System.out.println("Unable to create connection");
            e.printStackTrace();
        }


        String query7 ="SELECT MAX(amount) FROM payments";
        assert connect != null;
        PreparedStatement ps = connect.prepareStatement(query7);

        try {
            ResultSet results;
            results = connect.createStatement().executeQuery(query7);
            while (results.next()){
                String getResult = results.getString("7. ");
                System.out.println(getResult);
            }

        }
        catch (Exception e){
            System.out.println("You got an exception");
            System.out.println(e.getMessage());
        }

    }


}
