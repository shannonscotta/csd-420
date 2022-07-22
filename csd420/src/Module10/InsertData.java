package Module10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

  Connection con;

  Statement stmt;

  public InsertData(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(1,'Lebron','James','Lakers')") + "row updated");

      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(2,'Michael','Jordan','Bulls')") + "row updated");
      
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(3,'Larry','Bird','Celtics')") + "row updated");
      
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(4,'Kobe','Bryant','Lakers')") + "row updated");

      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(5,'Kevin','Durant','Nets')") + "row updated");

      stmt.executeUpdate("COMMIT");

      System.out.println("Data Inserted");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Insert Data Failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("Database connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    InsertData InsertData = new InsertData();
  }
}

/*

public class Fan {

    private int id;
    private String firstName;
    private String lastName;
    private String favoriteTeam;
    
    public Fan(String firstName, String lastName, String favoriteTeam){
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteTeam = favoriteTeam;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFavoriteTeam(){
        return favoriteTeam;
    }
    
    public void setFavoriteTeam(String favoriteTeam){
        this.favoriteTeam = favoriteTeam;
    }
}

 */