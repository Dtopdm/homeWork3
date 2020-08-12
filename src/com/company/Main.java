package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {37.1, 26.378, -54.232, 89.7, -55.65, -9.36, -12.9, 18.3, 32.7, 51.5, -47.965, -83.96, 15.5, 1.269, 62.4};
        double total = 0;
        boolean numbersAverage = false;
        double result;
        int numbersAmount = 0;

        for (double i : numbers) {
            if (i < 0) {
                numbersAverage = true;
            }
            if (numbersAverage) {
                if (i > 0) {
                    total += i;
                    numbersAmount++;
                }

            }
        }

        result = total / numbersAmount;
        System.out.println(result);
    }
    
}
