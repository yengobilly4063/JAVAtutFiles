package com.codz;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("58767794");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6\tTo show available actions)");
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                   mobilePhone.printContacts();
                   break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.print("Enter new contact name :");
        String name = scan.nextLine();
        System.out.print("Enter Phone Number :");
        String phone = scan.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name=" + name + ", phone=" + phone);
        }else{
            System.out.println("Cannot add " + name + ", already on file");
        }
    }

    private static void startPhone (){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions: \nPrress");
        System.out.println("0:\t-To shutdown");
        System.out.println("1:\t-To print contacts");
        System.out.println("2:\t-To add contact");
        System.out.println("3:\t-To update an existing contact");
        System.out.println("4:\t-To remove an existing contact.");
        System.out.println("5:\t-To query if an existing contact exists");
        System.out.println("2:\t-To print a list of available actions");
        System.out.println("\nChose your action :");
    }





}
