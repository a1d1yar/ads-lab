package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int[] array = new int[n];
        //for (int i=0; i<n; i++){
          //  array[i] = scanner.nextInt();

        String min = isPrime(n,2);
        System.out.println("number  is " + min);
    }


    public static String isPrime(int n, int div){
        String p = "prime";
        String c = "composite";

        if (n <= 2){
            return (n == 2) ? p : c;
        }
        if (n % div == 0){
            return c;
        }
        if (div * div > n){
            return p;
        }

        return isPrime(n , (div + 1));
    }



    public static double findAverage(int[] arr, int n){
        double sum,avg;
        if(n==1)
            return arr[0];
        else
        {
            sum= arr[n-1]+ (n-1) * findAverage(arr,n-1);
        }

        avg = sum/n;
        return avg;
    }

    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }

}