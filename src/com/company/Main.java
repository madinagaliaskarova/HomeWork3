package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {8.1, -2.6, -4.8, 2.3, 3.4, 6.1, 5.9, 1.6, 4.2, 6.7, 9.3, 1.5, 9.3, 9.1, 3.4};
        double lol = 0;
        int haker = 0;
        boolean hook = false;
        for (double nabers : numbers) {
            if (nabers < 0) {
                hook = true;
            } else if (hook) {
                haker++;
                lol += nabers;
            }
        }
        System.out.println(lol/haker);
    }
}
