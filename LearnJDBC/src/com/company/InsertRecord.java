package com.company;

import java.sql.*;

public class InsertRecord
{


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Student VALUES (1, 'Tom', 'SMCE')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES (2, 'Clark', 'SNIST')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES (3, 'Kent', 'JNTU')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES(4, 'Peter', 'OU')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Student VALUES(5, 'Patrick', 'OU')";
            stmt.executeUpdate(sql);

            sql="update student set college='NIT' where name= 'PATRICk'";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
