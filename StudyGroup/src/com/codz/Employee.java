package com.codz;

public class Employee {
    //Variables/Fields
    private String company = "ARVATO";
    private String name;
    private String isic;
    private int age;
    private String address;

    //Default constructor with no parameters
    public Employee(){

    }

    //2nd constructor with paramaters
    public Employee(String company, String name, String isic, int age, String addresss){
        this.company = company;
        this.name = name;
        this.isic = isic;
        this.address = addresss;
    }

    //3rd Constructor
    public Employee(String newName, String newIsic, int newAge, String newAddress){
        this.company = "ARVATO";
        this.name = newName;
        this.isic = newIsic;
        this.age = newAge;
        this.address = newAddress;
    }

    public String getName(){
        return this.name;
    }

    public String getCompany() {
        return company;
    }

    public String getIsic() {
        return isic;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsic(String isic) {
        this.isic = isic;
    }

    public void setAge(int age) {
        if (age <1 || age > 99){
            System.out.println("Age is out of range");
        }else{
            this.age = age;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
