package com.kishore.anant.calculator.salary;

import java.util.Scanner;

public class InHandSalaryCalculator {

    public static void main(String[] args) {

        int ctc = new Scanner(System.in).nextInt();
        //printInHandSalary(ctc);
    }

    /*private static void printInHandSalary(int ctc) {

        int gratutityPercentage = 4.81;
        int epfPercentage = 12;

        int gratuityComponent = ctc*gratutityPercentage;
        int epfComponent = ctc*epfPercentage;

        int remainingCTC = ctc - gratuityComponent - epfComponent;

        int taxComponent = calculateTaxes(remainingCTC);

        int hra = calculateHRA(remainingCTC, rent);


    }*/

    private static int calculateTaxes(int remainingCTC) {
        return 0;

    }

    private static int calculateHRA(int basicCTC, int rent){
        return 0;
    }
}
