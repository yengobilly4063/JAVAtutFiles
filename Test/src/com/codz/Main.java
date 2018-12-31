package com.codz;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2090);
    }



    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaByte = (kilobytes/1024);
            int remKiloBytes = (kilobytes%1024);
            System.out.println(kilobytes + " KB = " + megaByte + " MB and " + remKiloBytes + "KB" );
        }
    }
}
