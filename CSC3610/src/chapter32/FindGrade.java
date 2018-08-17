package chapter32;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class FindGrade extends Application {
  // Statement for executing queries
  private Statement stmt;
  private TextField tfSSN = new TextField();
  private TextField tfCourseId = new TextField();
  private Label lblStatus = new Label();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Initialize database connection and create a Statement object
    initializeDB();

    Button btShowGrade = new Button("Show Info");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("SSN"), tfSSN, 
      new Label("Course ID"), tfCourseId, (btShowGrade));

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblStatus);
    
    tfSSN.setPrefColumnCount(6);
    tfCourseId.setPrefColumnCount(6);
    btShowGrade.setOnAction(e -> showGrade());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 420, 80);
    primaryStage.setTitle("FindGrade"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage   
  }

  private void initializeDB() {
    try {
      // Load the JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
//      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver loaded");

      // Establish a connection
      Connection connection = DriverManager.getConnection
       // ("jdbc:mysql://localhost/javabook", "scott", "tiger");
          ("jdbc:mysql://127.0.0.1/jdbcTest", "jdbcTest", "testing123");
//    ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
//     "scott", "tiger");
      System.out.println("Database connected");

      // Create a statement
      stmt = connection.createStatement();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void showGrade() {
    String ssn = tfSSN.getText();
    String courseId = tfCourseId.getText();
    try {
      //String queryString = "select firstName, mi, " +
      // "lastName, title, grade from Student, Enrollment, Course " +
      //  "where Student.ssn = '" + ssn + "' and Enrollment.courseId "
      //   + "= '" + courseId +
      //  "' and Enrollment.courseId = Course.courseId " +
     //   " and Enrollment.ssn = Student.ssn";
    	String queryString = "select firstName, lastName, ssn, birthdate from Students" + 
    			" where ssn = '" + ssn + "'";
    	System.out.println( "Q:" +queryString );

      ResultSet rset = stmt.executeQuery(queryString);

      if (rset.next()) {
        String firstName = rset.getString(1);
        String lastName = rset.getString(2);
        String qSsn = rset.getString(3);
        String birthdate = rset.getString(4);

        // Display result in a label
        lblStatus.setText(firstName + " " + lastName + "'s birthdate: " + birthdate  );
      } else {
        lblStatus.setText("Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
