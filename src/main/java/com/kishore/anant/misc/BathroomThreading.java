package com.kishore.anant.misc;

import java.util.ArrayList;
import java.util.Scanner;

public class BathroomThreading {

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            boolean locked = false;
            System.out.print("Enter new Person identity:: ");
            Scanner scanner = new Scanner(System.in);

            String inputId = scanner.next();

            if (inputId != null) {
                inputId = inputId.toUpperCase();
                if (inputId.equalsIgnoreCase("R") || inputId.equalsIgnoreCase("D")) {
                    locked = checkBathroomStatus(inputId);
                } else {
                    System.out.print("Invalid input. Please enter 'R' for Republicans or 'D' for Democrats");
                }
                if (locked) {
                    System.out.println("Bathroom is occupied.");
                } else {
                    System.out.println("Bathroom is open to use.");
                    list.add(inputId.toUpperCase());
                }
            }
            System.out.println();
        }
    }


    private static boolean checkBathroomStatus(String identity) {

        if (identity.equalsIgnoreCase("R") && list.contains("D")) {
            return true;
        }

        if (identity.equalsIgnoreCase("D") && list.contains("R")) {
            return true;
        }

        if (list.size() >= 3) {
            return true;
        }

        return false;


    }
}
