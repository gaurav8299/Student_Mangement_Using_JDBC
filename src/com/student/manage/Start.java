/**
 *
 */
package com.student.manage;

/**
 *
 */

import java.io.*;
public class Start {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        System.out.println("Welcome to the Student Management App");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("PRESS 1 to ADD Student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("PRESS 4 to Exit App");
            int c = Integer.parseInt( br.readLine());

            if(c == 1)
            {
                //add student

                System.out.println("Enter the name :");
                String name = br.readLine();
                System.out.println("Enter the user Phone :");
                String phone = br.readLine();
                System.out.println("Enter user City :");
                String city = br.readLine();


                //create student object to store student
                Student st = new Student(name,phone,city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if(answer) {
                    System.out.println("Student is added successfully....");
                }else {
                    System.out.println("Something went wrong try again.....");
                }
                System.out.println(st);
            }else if(c == 2)
            {
                //Delete Student
                System.out.println("Enter the Student Id to Delete: ");
                int userID = Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userID);

                if(f){
                    System.out.println("Deleted......");
                }else {
                    System.out.println("Something went wrong.........");
                }
            }else if(c == 3)
            {
                // Display students....
                StudentDao.showAllStudent();
            }else if(c == 4)
            {
                //Exit
                break;
            }else
            {

            }
        }
        System.out.println("Thankyou for using my application....");
        System.out.println("See you soon...bye bye");
    }

}
