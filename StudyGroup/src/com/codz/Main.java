package com.codz;

public class Main {

    public static void main(String[] args) {


//        System.out.println("Employee name is " + employee.name);
//        System.out.println("Employee name is " + employee.name);
//        System.out.println(employee.company);
//        System.out.println(employee.company);

        //1st Construtor
        Employee emp1 = new Employee();
//        emp1.setCompany("HESBURGER");
//        System.out.println("Employee 1's company name is " + emp1.getCompany());
//        emp1.setCompany("ARVATO");
//        System.out.println("Employee 1's new company name is " + emp1.getCompany());
//        emp1.address = "Emdla";
//        emp1.age = 12;
//        emp1.isic = "99876";
//        emp1.name = "Bill YENGO";
//        emp1.company = "MAZDA";

        //2nd Constructor
        Employee emp2 = new Employee("DENCA", "Mark Jones", "987564", 24, "E. vilde tee" );
//        System.out.println("Employee name is " + emp2.getName());
//        System.out.println("Employee company is " + emp2.getCompany());

        //3rd constructor
        Employee emp3 = new Employee("name", "97543782", 26, "endla 23");
//        System.out.println("Employee 3's company name is " + emp3.getCompany());

//        emp1.setAge(45);
//        System.out.println(emp1.getAge());


            Circle c1 = new Circle();

        System.out.println("Default radius is " + c1.getRadius());
        System.out.println("Default area is " + c1.getArea());

        System.out.println("");

        Circle c2 = new Circle(4.0);
        System.out.println("new Radius of c2 is " + c2.getRadius());
        System.out.println("Default area for " + c2.getRadius() + " is " + c2.getArea());




    }
}
