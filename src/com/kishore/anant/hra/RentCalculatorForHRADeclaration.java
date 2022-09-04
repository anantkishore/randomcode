package com.kishore.anant.hra;

public class RentCalculatorForHRADeclaration {

    public static void main(String[] args) {

        double actual_hra_received = 40832 * 12.0;
        double basic_ka_40 = 102280 * 12 * .4;

        System.out.println("actual_hra_received::" + actual_hra_received);
        System.out.println("basic_ka_40::" + basic_ka_40);

        double actual_rent_paid = 0.0;
        double max_hra_exemption = Integer.MIN_VALUE;
        int max_rent = 0;
        for (int i = 0; i < 100000; i++) {
            double actual_rent_paid_minus_basic_ka_10 = (i * 12) - (0.1 * 102280 * 12);
            double hra_exemption = Math.min(actual_rent_paid_minus_basic_ka_10, actual_hra_received);
            if (max_hra_exemption < hra_exemption) {
                max_hra_exemption = hra_exemption;
                max_rent = i;
            }
        }
        System.out.println(max_hra_exemption);
        System.out.println(max_rent);

    }
}
