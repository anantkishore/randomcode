package com.kishore.anant.multithreading;

public class PrintOddEven {

    volatile boolean isEven = true;

    public static void main(String[] args) throws InterruptedException {

        PrintOddEven printOddEven = new PrintOddEven();

        Thread oddPrinter = new Thread(new Printer(1, printOddEven));
        Thread evenPrinter = new Thread(new Printer(0, printOddEven));

        System.out.println("Start of program");

        oddPrinter.start();
        evenPrinter.start();

        oddPrinter.join();
        evenPrinter.join();

        System.out.println("End of program");

    }
}

class Printer implements Runnable {

    private int counter;
    private PrintOddEven printOddEven;

    public Printer(int counterParam, PrintOddEven printOddEven) {
        this.counter = counterParam;
        this.printOddEven = printOddEven;
    }

    @Override
    public void run() {
        do {
            synchronized (this.printOddEven) {
                if (this.printOddEven.isEven) {
                    if (this.counter % 2 == 0) {
                        System.out.println(this.counter);
                        this.counter += 2;
                        this.printOddEven.isEven = false;
                    } else {
                        this.printOddEven.notify();
                    }
                } else {
                    if (this.counter % 2 != 0) {
                        System.out.println(this.counter);
                        this.counter += 2;
                        this.printOddEven.isEven = true;
                    } else {
                        this.printOddEven.notify();
                    }
                }
            }
        } while (this.counter <= 20);

    }
}
