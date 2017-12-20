package com.colucy;

public class PrinterApp {

    public static void main(String[] args) {

        Printer printer = new Printer(50, "yes");
        System.out.println("Initial page count " + printer.getNumberOfPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPages());


    }
    

}
