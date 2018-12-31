package com.codz;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Unknown User", "user@mail.com", "59757703");
        System.out.println("Emptly Constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                       String cusPhoneNumber){
        System.out.println("Account Constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = cusPhoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999", 100.55, customerName, email, phoneNumber);

    }


    public void setAccountNumber(String acctNumber){
        this.accountNumber = acctNumber;
    }
    public String getAccountNumber(){
        return (this.accountNumber);
    }


    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getBalance(){
        return (this.customerName);
    }


    public void setCustomerName(String custName){
        this.customerName = custName;
    }
    public String getCustomerName(){
        return (this.accountNumber);
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return (this.email);
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return (this.phoneNumber);
    }

    public void depositeFunds(double depositFunds){
        this.balance += depositFunds;
        System.out.println("\nDeposit Processed!");
        System.out.println("==RECEIPT==");
        System.out.println("Account Number \t\t: " + this.accountNumber);
        System.out.println("Funds deposited \t: " + depositFunds);
        System.out.println("New Balance \t\t: " + this.balance);
    }
    public void withdrawFunds(double  withdrawFunds){
        if ( withdrawFunds <= this.balance){
            this.balance -= withdrawFunds;
            System.out.println("\nWithdrawal Processed!");
            System.out.println("==RECEIPT==");
            System.out.println("Account Number \t\t: " + this.accountNumber);
            System.out.println("Funds withdrawed \t: " + withdrawFunds);
            System.out.println("New Balance \t\t : " + this.balance);
        }else {
            System.out.println("\nInsufficient Funds " + this.balance + " found!");
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
