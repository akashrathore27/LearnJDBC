package com.company;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void FetchAllInformationOfDepartment(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("dept_id");
                String name = rs.getString("dept_name");
                String loc = rs.getString("dept_location");
                System.out.println(id + " " + name + " " + loc);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void FetchRecordOfEmployee(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String job_name = rs.getString("job_name");
                String manager_id = rs.getString("manager_id");
                Date hire_date = rs.getDate("hire_date");
                double salary = rs.getDouble("salary");
                double commission = rs.getDouble("commission");
                int dept_id = rs.getInt("dept_id");
                System.out.println(emp_id + " " + emp_name + " " + job_name + " " + manager_id + " " + hire_date + " " + salary + " " + commission + " " + dept_id);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ThirdQuestion(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String job_name = rs.getString("job_name");
                String manager_id = rs.getString("manager_id");
                Date hire_date = rs.getDate("hire_date");
                double salary = rs.getDouble("salary");
                double commission = rs.getDouble("commission");
                int dept_id = rs.getInt("dept_id");
                System.out.println(emp_id + " " + emp_name + " " + job_name + " " + manager_id + " " + hire_date + " " + salary + " " + commission + " " + dept_id);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void FourthQuestion(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String job_name = rs.getString("job_name");
                String manager_id = rs.getString("manager_id");
                Date hire_date = rs.getDate("hire_date");
                double salary = rs.getDouble("salary");
                double commission = rs.getDouble("commission");
                int dept_id = rs.getInt("dept_id");
                System.out.println(emp_id + " " + emp_name + " " + job_name + " " + manager_id + " " + hire_date + " " + salary + " " + commission + " " + dept_id);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void FifthQuestion(String query)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String job_name = rs.getString("job_name");
                String manager_id = rs.getString("manager_id");
                Date hire_date = rs.getDate("hire_date");
                double salary = rs.getDouble("salary");
                double commission = rs.getDouble("commission");
                int dept_id = rs.getInt("dept_id");
                System.out.println(emp_id + " " + emp_name + " " + job_name + " " + manager_id + " " + hire_date + " " + salary + " " + commission + " " + dept_id);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void SixthQuestion(String query)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nexturn", "root", "12345");
            //here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String emp_name = rs.getString("emp_name");
                String job_name = rs.getString("job_name");
                String manager_id = rs.getString("manager_id");
                Date hire_date = rs.getDate("hire_date");
                double salary = rs.getDouble("salary");
                double commission = rs.getDouble("commission");
                int dept_id = rs.getInt("dept_id");
                System.out.println(emp_id + " " + emp_name + " " + job_name + " " + manager_id + " " + hire_date + " " + salary + " " + commission + " " + dept_id);
                System.out.println("___________________________");
            }
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int choice = 0;
        while (choice!=6)
        {
            System.out.println("Press 1. Fatch the complete Information about the employees ");
            System.out.println("Press 2. Compute the average salary of the employees who work as ' ANALYST");
            System.out.println("Press 3. Find the employees whose commission is more than their salary ");
            System.out.println("Press 4. Find the employees whose salary exceeds 3000 after giving 25 % Increment  ");
            System.out.println("Press 5.Fetch the employees Information whose experience is more than 27  ");
            System.out.println("Enter Your choice");
            choice=sc.nextInt();
        switch (choice)
        {
            case 1:  Main.FetchRecordOfEmployee("select*from Employee");
            break;
            case 2:
                System.out.println("Plaese Give a Job type");
                String job_type=sc.nextLine();
                Main.ThirdQuestion("select*from Employee where job_name='"+job_type+"'");
            break;
            case 3:  Main.FourthQuestion("select *from employee where commission>salary");
            break;
            case 4: Main.FifthQuestion( " select*from Employee where salary=salary*0.25>3000");
            break;
            case 5: Main.SixthQuestion( "select*from employee where (current_date()-hire_date)>27");
            break;
            case 6:
                System.out.println("Press 6. For exit");
                System.exit(0);
            default:
                System.out.println("Choose invalid choice");
        }

        }









    }
}
