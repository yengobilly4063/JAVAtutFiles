package com.codz;

public class Main {

    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.fullName = "Bill";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        damage = 11;
//        player.health = 200;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Bill", 200, "sword");

        //PRINTER
        Printer printer = new Printer(50, false);
        System.out.println("Current toner level is " + printer.getTonerLevel());
        printer.addTonerLevel(-10);
//        System.out.println("Current toner level is " + printer.getTonerLevel());
//        printer.addTonerLevel(-60);
        System.out.println("Current toner level is " + printer.getTonerLevel());
        printer.printPages(5);
        System.out.println("Number of pages printed " + printer.getPrintedPages());
        printer.printPages(5);
        System.out.println("Number of pages printed " + printer.getPrintedPages());
        printer.printPages(0);
        System.out.println("Number of pages printed " + printer.getPrintedPages());

        System.out.println("Total lifetime printed pages " + printer.getTotalPagesPrintedByPrinter());


    }
}
