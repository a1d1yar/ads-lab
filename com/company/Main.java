package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task  number:");
        int functionNumber = scanner.nextInt();

        switch (functionNumber) {
            case 1:
                System.out.println("task 10");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int gcdResult = findGCD(a, b);
                System.out.println("The GCD is " + gcdResult);
                break;

            case 2:
                System.out.println("task 9");
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int binomCoefResult = binomCoef(n, k);
                System.out.println("The binomial coefficient is " + binomCoefResult);
                break;

            case 3:
                System.out.println("task 8");
                String s = scanner.next();
                boolean isDigitsResult = isDigits(s);
                if (isDigitsResult==true){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
                break;

            case 4:
                System.out.println("task 7");
                int length = scanner.nextInt();
                int[] arr = new int[length];
                for (int i = 0; i < length; i++) {
                    arr[i] = scanner.nextInt();
                }
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                reverseArray(arr,0, length-1);
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 5:
                System.out.println("task 6");
                int n2 = scanner.nextInt();
                int i = scanner.nextInt();
                int powResult = findPow(n2, i);
                System.out.println("power of "+n2+"in "+i+"is"+ powResult);
                break;

            case 6:
                System.out.println("task 5");
                int n3 = scanner.nextInt();
                int fibonacciResult = findFibonacci(n3);
                System.out.println("The " + n3 + "th Fibonacci number is " + fibonacciResult);
                break;

            case 7:
                System.out.println("task 4");
                int n4 = scanner.nextInt();
                int factorResult = findFactor(n4);
                System.out.println(n4 + "! = " + factorResult);
                break;

            case 8:
                System.out.println("task 3");
                int n5 = scanner.nextInt();
                String primeResult = isPrime(n5, 2);
                System.out.println(n5 + " is " + primeResult);
                break;

            case 9:
                System.out.println("task 2");
                int n6 = scanner.nextInt();
                int[] array = new int[n6];
                for (int ij=0; ij<n6; ij++){
                    array[ij] = scanner.nextInt();
                }
                double mini = findAverage(array, n6);
                System.out.println("Average is " + mini);




            default:
                System.out.println("Invalid function number!");
        }
    }
    /**
     * task 10.The findGCD function takes two integers as parameters, a and b, and returns their greatest common divisor (GCD)
     * using the Euclidean algorithm.
     *
     * @param a is the first integer.
     * @param b is the second integer.
     * @return the GCD of the two integers.
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    /**
     * task 9.The binomCoef function takes two integers as parameters, n and k, and returns their binomial coefficient using recursion.
     *
     * @param n is the total number of items.
     * @param k is the number of items to be chosen.
     * @return the binomial coefficient of the two integers.
     */
    public static int binomCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomCoef(n - 1, k - 1) + binomCoef(n - 1, k);
        }
    }

    /**
     * task 8.The isDigits function takes a String as a parameter and returns a boolean indicating whether or not the string contains only digits.
     *
     * @param s is the String to be checked for digits.
     * @return a boolean indicating whether or not the String contains only digits.
     */
    public static boolean isDigits(String s) {
        if (s.length() == 0) {
            return false;
        } else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        } else {
            return Character.isDigit(s.charAt(0)) && isDigits(s.substring(1));
        }
    }

    /**
     * task 7.The reverseArray function takes an array of integers, a starting index, and an ending index as parameters
     * and reverses the order of the elements in the array between the starting and ending indices.
     *
     * @param arr   is the array to be reversed.
     * @param start is the starting index of the subarray to be reversed.
     * @param end   is the ending index of the subarray to be reversed.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    /**
     * task 6.The findPow function takes two integers as parameters, n and i, and returns n raised to the power of i.
     *
     * @param n is the base.
     * @param i is the exponent.
     * @return the result of n raised to the power of i.
     */
    public static int findPow(int n, int i) {
        if (i == 1) {
            return n;
        }
        if (i == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return n * findPow(n, i - 1);

    }

    /**
     * Task 5. This function takes an integer parameter n, and calculates the nth Fibonacci number.
     *
     * @param n the index of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static int findFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    /**
     * Task 4. Contains a function to find the factorial of a number.
     *
     * @param n the number to find the factorial of.
     * @return the factorial of n.
     */
    public static int findFactor(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }

        return n * findFactor(n - 1);
    }

    /**
     * Task 3. Contains a function to check if a number is prime.
     *
     * @param n   the number to check if it is prime.
     * @param div the divisor to check if n is divisible by it.
     * @return "prime" if n is prime, "composite" otherwise.
     */
    public static String isPrime(int n, int div) {
        String p = "prime";
        String c = "composite";

        if (n <= 2) {
            return (n == 2) ? p : c;
        }
        if (n % div == 0) {
            return c;
        }
        if (div * div > n) {
            return p;
        }

        return isPrime(n, (div + 1));
    }

    /**
     * Task 2. Contains a function to calculate the average of an array of integers.
     *
     * @param arr the array of integers to calculate the average of.
     * @param n   the number of elements in the array.
     * @return the average of the elements in the array.
     */
    public static double findAverage(int[] arr, int n) {
        double sum, avg;
        if (n == 1)
            return arr[0];
        else {
            sum = arr[n - 1] + (n - 1) * findAverage(arr, n - 1);
        }

        avg = sum / n;
        return avg;
    }

    /**
     * Task 1. Contains a function to find the minimum element in an array of integers.
     *
     * @param arr the array of integers to find the minimum element from.
     * @param n   the number of elements in the array.
     * @return the minimum element in the array.
     */
    public static int findMinFromArr(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}

