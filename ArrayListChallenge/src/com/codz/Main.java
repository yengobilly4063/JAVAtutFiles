package com.codz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        MobilePhone mobilePhone =  new MobilePhone();

        Contacts contact1 = new Contacts("Bill YENGO", "58757703");
        Contacts contact2 = new Contacts("Mark Anthony", "676547898");
        Contacts contact3 = new Contacts("Mark", "58757703");
        mobilePhone.storeContact(contact1);
        mobilePhone.storeContact(contact2);
        mobilePhone.storeContact(contact3);
        mobilePhone.printAllContacts();

        System.out.print("Search (name/phone number) : ");
        String contactInfo = scan.nextLine();
        mobilePhone.findContact(contactInfo);


    }
}
