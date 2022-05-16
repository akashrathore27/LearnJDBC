package com.company.ServiceDao;

import com.company.hotelBooking.SQLUtil;

public class AddBooking
{
    private int customerId;
    private String customerName;
    private int roomNo;
    private double totalBillAmount;
    private long contactNo;

    public int getCustomerId() {

        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public double getTotalBillAmount() {
        return totalBillAmount;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "AddBooking{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", roomNo=" + roomNo +
                ", totalBillAmount=" + totalBillAmount +
                ", contactNo=" + contactNo +
                '}';
    }
}
