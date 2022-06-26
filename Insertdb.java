package com.company;

import java.sql.*;

public class Insertdb {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO MyMovies values ('The notebook','Ryan gosling','rachel McAdams', 2004,'Nick Cassavettes');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO MyMovies values ('Spider Man No way home','Tom Holland','Zendaya', 2021,'Jon watts');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Bajirao mastani','Ranveer Singh','Deepika padukone',2015,'Sanjay leela bhansali');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Padmavat','Ranveer Singh','Deepika padukone',2018,'Sanjay leela bhansali');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values ('KGF-2','Yash','Srindhi Shetty',2022,'Prashanth Neel');";
            stmt.executeUpdate(query4); // Create Query-4

            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}