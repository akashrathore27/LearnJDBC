package com.company;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsingPreparedStatement {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            PreparedStatement pstmt =
                    con.prepareStatement("insert into student values(?,?,?)");
            char choice;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter name");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter phone");
                String college = sc.nextLine();

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, college);

                pstmt.executeUpdate();
                System.out.println("do you want to insert more records? y/n ");
                choice = sc.next().charAt(0);
            } while (choice == 'y');
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
}
