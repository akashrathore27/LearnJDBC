package com.company.hotelBooking;

import java.sql.*;

public class SQLUtil {
    static String DRIVER_PATH =
            "com.mysql.cj.jdbc.Driver";
     static String DB_USER = "root";
     static String DB_PASSWORD = "12345";
     static String DB_NAME = "nexturn";
     static int PORT = 3306;
     static String HOST = "localhost";
     static String DB_URL = "jdbc:mysql://" +
            HOST + ":" + PORT + "/" + DB_NAME;
    static Connection conn;
    static Statement stmt;

    static void connectDB() throws
            ClassNotFoundException, SQLException {
        Class.forName(DRIVER_PATH);
// step2: establish the connection
        conn = DriverManager.getConnection(DB_URL,
                DB_USER, DB_PASSWORD);
// step3: create statement
        stmt = conn.createStatement();
    }
    static void close() throws SQLException {
        if (stmt != null && conn != null) {
            stmt.close();
            conn.close();
        }
    }

}
