package com.company.hotelBooking;

import com.company.ServiceDao.AddBooking;

import java.sql.*;
import java.util.Scanner;

public class HotelBookingApplication
{

    public  static  int update(Scanner sc,AddBooking add)
    {
        try {
            SQLUtil.connectDB();
            System.out.println("Enter Customer Id for update room number");
            add.setCustomerId(sc.nextInt());
            System.out.println("Enter room number for update");
            sc.nextLine();
            int  roomNo=sc.nextInt();
            System.out.println(add.getCustomerId());
            System.out.println(roomNo);
            String query = "update hotel_details set roomNo="+roomNo+" where customerId=" + add.getCustomerId();
            int res = SQLUtil.stmt.executeUpdate(query);
            if(res==0)
            {
                System.out.println("Room Details Update failed");
            }
            else
            {
                System.out.println("Room details update successfully");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Room Details Update failed");
        }
        return  0;
    }
    public static void insertTheData(AddBooking add)
    {
        try {
            SQLUtil.connectDB();
            PreparedStatement pstmt =
                    SQLUtil.conn.prepareStatement("insert into hotel_details values(?,?,?,?,?)");
            String choice;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter Customer id");
                add.setCustomerId(sc.nextInt());
                int customerId = add.getCustomerId();
                System.out.println("Enter Customer name");
                sc.nextLine();
                add.setCustomerName(sc.next());
                String customerName = add.getCustomerName();
                System.out.println("Enter room Number");
                add.setRoomNo(sc.nextInt());
                int roomNo = add.getRoomNo();
                System.out.println("Enter Total Bill Amount");
                add.setTotalBillAmount(sc.nextDouble());
                double totalBillAmount= add.getTotalBillAmount();
                System.out.println("Enter Contact Number");
                add.setContactNo(sc.nextLong());
                long contactNo=add.getContactNo();

                pstmt.setInt(1, customerId);
                pstmt.setString(2, customerName);
                pstmt.setInt(3, roomNo);
                pstmt.setDouble(4,totalBillAmount);
                pstmt.setLong(5,contactNo);

                pstmt.executeUpdate();
                System.out.println("do you want to insert more records? y/n ");
                choice = sc.nextLine();
            } while (choice == "y");
            SQLUtil.close();
        } catch (Exception ex) {
            System.out.println("DataProvider. TECHNICAL_ERROR");

        }
    }
    public  static void FetchRecordOfEmployee() {
        try {
            SQLUtil.connectDB();
            String query="select*from hotel_Details;";
            ResultSet rs = SQLUtil.stmt.executeQuery(query);
            while (rs.next()) {
                int customerId = rs.getInt("customerId");
                String customerName = rs.getString("customerName");
                int roomNo = rs.getInt("roomNo");
                double totalBillAmount = rs.getDouble("totalBillAmount");
                long contactNo = rs.getLong("contactNo");

                System.out.println(customerId + " " + customerName + " " + roomNo + " " + totalBillAmount + " " + contactNo);
                System.out.println("___________________________");
            }
            SQLUtil.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        AddBooking add=new AddBooking();
        Scanner sc=new Scanner(System.in);
        System.out.println("***************Welcome To  Hotel***************** ");

        int choose=0;
        while (choose!=4)
        {
            System.out.println("Press 1. For Add the customer Details ");
            System.out.println("Press 2. For Update the customer Details ");
            System.out.println("Press 3. For Get the Details of the customer");
            System.out.println("Press 4.For exit");
            System.out.println("Enter your Choice");
            choose=sc.nextInt();
            switch (choose)
            {
                case 1:insertTheData(add);
                break;
                case 2:update(sc,add);
                break;
                case 3:HotelBookingApplication.FetchRecordOfEmployee();
                break;
                case 4:System.exit(0);

            }
        }




    }
}
