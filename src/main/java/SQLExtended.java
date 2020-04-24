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
        String query1 ="SELECT * FROM Customers";

        if (connect!=null){

            try {
              results = connect.createStatement().executeQuery(query1);
               while (results.next()){
                   String getResult = results.getString("1");
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

        ResultSet results;
        String query1 ="SELECT FirstName FROM Customers";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("2");
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

        ResultSet results;
        String query1 ="SELECT FirstName FROM Customers WHERE customerid =1";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("1");
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

        ResultSet results;
        String query1 ="SELE";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("1");
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

        ResultSet results;
        String query1 ="SELECT * FROM Customers";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("1");
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

        ResultSet results;
        String query1 ="SELECT * FROM Customers";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("1");
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

        ResultSet results;
        String query1 ="SELECT * FROM Customers";

        if (connect!=null){

            try {
                results = connect.createStatement().executeQuery(query1);
                while (results.next()){
                    String getResult = results.getString("1");
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
    }


}
