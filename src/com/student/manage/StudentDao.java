package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st) {
        boolean f = false;

        try {
            // JDBC code...
            Connection con = CP.createC();
            String q = "insert into students(sname, sphone, scity) values (?, ?, ?)";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);

            // Set the values
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            // Execute
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userID) {
        boolean f = false;

        try {
            // JDBC code...
            Connection con = CP.createC();
            String q = "delete from students where sid = ?";

            // PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(q);

            // Set the values
            pstmt.setInt(1, userID);
            // Execute
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudent() {
        boolean f = false;

        try {
            // JDBC code...
            Connection con = CP.createC();
            String q = "select * from students";

           Statement stmt = con.createStatement();
            ResultSet set =   stmt.executeQuery(q);


           while(set.next()){
               int id = set.getInt(1);
               String name = set.getString(2);
               String phone = set.getString(3);
               String city = set.getString("scity"); // we can give the column name also instead of number like ("scity")


               System.out.println("ID : "+id);
               System.out.println("Name : "+name);
               System.out.println("Phone : "+phone);
               System.out.println("City : "+city);
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
           }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
