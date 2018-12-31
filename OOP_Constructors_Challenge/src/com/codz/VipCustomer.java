package com.codz;

public class VipCustomer {

    private static String customerName;
    private static double creditLimit;
    private static String emailAddress;

    public  VipCustomer(){
        this("Default Name", 50000.00, "defauly@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public static String getCustomerName() {
        return customerName;
    }

    public static double getCreditLimit() {
        return creditLimit;
    }

    public static String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "Customer Name ='" + customerName + '\'' +
                ", Credit Limit =" + creditLimit +
                ", Email Address ='" + emailAddress + '\'' +
                '}';
    }
}
