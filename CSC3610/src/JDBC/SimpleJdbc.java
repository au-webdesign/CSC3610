package JDBC;


import java.sql.*;

public class SimpleJdbc {
  public static void main(String[] args)
      throws SQLException, ClassNotFoundException {
    // Load the JDBC driver 
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("Driver loaded1");
    // Connect to a database 
    Connection connection = DriverManager.getConnection
       ("jdbc:mysql://127.0.0.1/jdbcTest", "jdbcTest", "testing123"); 
     System.out.println("Database connected");
     // Create a statement 
     Statement statement = connection.createStatement();
    // Execute a statement 
     String sql = "select firstName,  lastName, ssn from Students where lastName " 
    	     + " = 'Jackson'";
      ResultSet resultSet = statement.executeQuery( sql );

 // Iterate through the result and print the student names 
     while (resultSet.next())
      System.out.println(resultSet.getString(1) + "\t" +
        resultSet.getString(2) + "\t" + resultSet.getString(3));

  // Close the connection
     connection.close(); 
    }
  }