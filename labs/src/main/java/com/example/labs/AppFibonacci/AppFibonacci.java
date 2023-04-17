package com.example.labs.AppFibonacci;

public class AppFibonacci {

    public static void main(String[] args) {
        int iterator = 10;

        System.out.println("\n" + "--- fibonacciVersion1 ---");
        fibonacciVersion1(iterator);

        System.out.println("\n\n" + "--- fibonacciVersion2 ---");
        for (int i = 0; i < iterator; i++) {
            System.out.print(fibonacciVersion2(i) + " ");
        }

        System.out.println("\n\n" + "--- fibonacciVersion3 ---");
        for (int i = 0; i < iterator; i++) {
            System.out.print(fibonacciVersion3(i) + " ");
        }
    }

    static void fibonacciVersion1(int N) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    static int fibonacciVersion2(int n) {
        if (n <= 1)
            return n;
        // Recursive call
        return fibonacciVersion2(n - 1)
                + fibonacciVersion2(n - 2);
    }

    static int fibonacciVersion3(int n) {
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];
        int i;

        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
        // Nth Fibonacci Number
        return f[n];
    }

}
