package Module10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {

  Connection con;

  Statement stmt;

  public InsertDataExample(){

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

    InsertDataExample InsertData = new InsertDataExample();
  }
}

/*
CREATE database pysports;

DROP USER IF EXISTS 'pysports_user'@'localhost';

-- create pysports_user and grant all privileges to the pysports database
CREATE USER 'pysports_user'@'localhost' IDENTIFIED WITH mysql_native_password BY 'MySQL8IsGreat!';
CREATE USER 'pysports_user'@'%' IDENTIFIED WITH mysql_native_password BY 'MySQL8IsGreat!';

-- grant all privileges to the pysports database to user pysports_user on localhost
GRANT ALL PRIVILEGES ON pysports.* TO 'pysports_user'@'localhost';
GRANT ALL PRIVILEGES ON pysports.* TO 'pysports_user'@'%';

USE pysports;

-- drop tables if they are present
DROP TABLE IF EXISTS player;
DROP TABLE IF EXISTS team;

-- create the team table
CREATE TABLE team (
    team_id     INT             NOT NULL        AUTO_INCREMENT,
    team_name   VARCHAR(75)     NOT NULL,
    mascot      VARCHAR(75)     NOT NULL,
    PRIMARY KEY(team_id)
);

-- create the player table and set the foreign key
CREATE TABLE player (
    player_id   INT             NOT NULL        AUTO_INCREMENT,
    first_name  VARCHAR(75)     NOT NULL,
    last_name   VARCHAR(75)     NOT NULL,
    team_id     INT             NOT NULL,
    PRIMARY KEY(player_id),
    CONSTRAINT fk_team
    FOREIGN KEY(team_id)
        REFERENCES team(team_id)
);


-- insert team records
INSERT INTO team(team_name, mascot)
    VALUES('Team Gandalf', 'White Wizards');

INSERT INTO team(team_name, mascot)
    VALUES('Team Sauron', 'Orcs');


-- insert player records
INSERT INTO player(first_name, last_name, team_id)
    VALUES('Thorin', 'Oakenshield', (SELECT team_id FROM team WHERE team_name = 'Team Gandalf'));

INSERT INTO player(first_name, last_name, team_id)
    VALUES('Bilbo', 'Baggins', (SELECT team_id FROM team WHERE team_name = 'Team Gandalf'));

INSERT INTO player(first_name, last_name, team_id)
    VALUES('Frodo', 'Baggins', (SELECT team_id FROM team WHERE team_name = 'Team Gandalf'));

INSERT INTO player(first_name, last_name, team_id)
    VALUES('Saruman', 'The White', (SELECT team_id FROM team WHERE team_name = 'Team Sauron'));

INSERT INTO player(first_name, last_name, team_id)
    VALUES('Angmar', 'Witch-king', (SELECT team_id FROM team WHERE team_name = 'Team Sauron'));

INSERT INTO player(first_name, last_name, team_id)
    VALUES('Azog', 'The Defiler', (SELECT team_id FROM team WHERE team_name = 'Team Sauron'));
 */