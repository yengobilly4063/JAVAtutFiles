package com.codz;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();
    private String name;

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }


    public void modifyGroceryItem(int position, String newItem){
        System.out.println("Replacing " + groceryList.get(position) + " with " + newItem + "...");
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (++position) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        System.out.println("Removing " + groceryList.get(position));
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
//        boolean exist = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if ( position >= 0 ){
            return groceryList.get(position);
        }else{
            return null;
        }
    }

}
