package com.codz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while (!quit){
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    System.out.println("Exiting program ...");
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of Grocery Items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item in the list.");
        System.out.println("\t5 - To search an item in the list.");
        System.out.println("\t6 - To process the array/List.");
        System.out.println("\t7 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter a grocery item :");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Please enter item name ");
        String itmNo = scan.nextLine();
        System.out.print("Enter replacement item : ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem( (itmNo), newItem);
    }

    public static void removeItem(){
        System.out.print("Please enter item name to remove ");
        String itmNo = scan.nextLine();
        groceryList.removeGroceryItem(itmNo);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for : ");
        String searchItem = scan.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in grocery list");
        }else{
            System.out.println(searchItem + " is not in grocery list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String>  newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }
}
