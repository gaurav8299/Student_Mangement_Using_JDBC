package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    static Connection con;

    public static Connection createC() {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            String user = "root";
            String password = "1234";
            String url = "jdbc:mysql://localhost:3306/student_manage?user=root&password=1234";
            con = DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
