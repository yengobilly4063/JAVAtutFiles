package com.codz;
//CHALLENGE
public class Printer {
    private int tonerLevel;
    private static int totalPagesPrintedByPrinter;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        this.printedPages = 0;
        this.duplexPrinter = duplexPrinter;

        if ( (tonerLevel > -1) && (tonerLevel <= 100) ){
            this.tonerLevel = tonerLevel;
        }else{
            tonerLevel = -1;
        }

    }

    public int addTonerLevel(int tonerAmount){
        int tempToner = (this.tonerLevel + tonerAmount );

        if (tonerAmount > 0 && tonerAmount<=100 ){
            if ( tempToner > 100 ){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        this.printedPages = 0;
        int pagesToPrint = pages;
        if (this.duplexPrinter){
            pagesToPrint = ((pages/2) + (pages%2));
            System.out.println("Printing in duplex mode");
        }
        this.printedPages += pagesToPrint;
        this.totalPagesPrintedByPrinter += pagesToPrint;
        return pagesToPrint;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public static int getTotalPagesPrintedByPrinter() {
        return totalPagesPrintedByPrinter;
    }
}
