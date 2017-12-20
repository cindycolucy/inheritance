package com.colucy;

public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private String duplex;

    public Printer(int tonerLevel, String duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else

        {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.numberOfPages = 0;
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

            } else {
                return -1;
        }
    }

    public int printPages(int numberOfPages) {
        tonerLevel -= 10;
        numberOfPages++;
        if (duplex.equals("yes")) {
            System.out.println("Printing on both sides.");
        }
        return numberOfPages;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

}
