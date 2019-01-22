package com.codz;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList <Contacts> contact = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContact() {
        return contact;
    }


    public void storeContact(Contacts newContact){
        contact.add(newContact);
    }


    public void modifyContact(Contacts currentContact, Contacts newContact){
        int position = contact.indexOf(currentContact);
        if ( position>=0 ){
            contact.add(position, newContact);
        }
    }

    public void removeContact(Contacts rmContact){
        int position = contact.indexOf(rmContact);
        if ( position>=0 ){
            contact.remove(position);
        }
    }

    public void findContact(String contactInfo){
        Contacts contactFound;
        ArrayList<Contacts> contactsFoundList = new ArrayList<Contacts>();

        for (int i=0; i<contact.size(); i++){
            if ( (contact.get(i).getName().equals(contactInfo)) || (contact.get(i).getPhoneNumber().equals(contactInfo))  ){
                contactFound = contact.get(i);
                contactsFoundList.add(contactFound);
            }
        }

        if (contactsFoundList != null){
            for (int i=0; i<contactsFoundList.size(); i++){
                contactFound = contactsFoundList.get(i);
                printContact(contactFound);
            }
        }
        System.out.println("Contact info " + contactInfo + " not found !");

    }

    public void printAllContacts(){
        ArrayList<Contacts> allContacts = new ArrayList<>(getContact());
        for (int i=0; i<allContacts.size(); i++){
            System.out.println("Name : " + allContacts.get(i).getName());
            System.out.println("Phone Number : " + allContacts.get(i).getPhoneNumber() + "\n");
        }
    }

    public void printContact(Contacts contact){
        System.out.println("Name : " + contact.getName());
        System.out.println("Phone Number : " + contact.getPhoneNumber() + "\n");
    }
}