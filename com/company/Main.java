package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        /*int[] array = new int[n];
          for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();*/

        int min = findPow(n,i);
        System.out.println(n+" in power of "+i+" is " + min);
    }

    public static int findPow(int n,int i){
        if(i==1) {
            return n;
        }
        if(i==0){
            return 1;
        }
        if(n==1) {
            return 1;
        }
        if(n==0){
            return 0;
        }

        return  n*findPow(n,i-1);

    }


    public static int findFibonacci(int n){
        if(n==1) {
            return 1;
        }
        if(n==0){
            return 0;
        }

        return  findFibonacci(n-1)+findFibonacci(n-2);
    }

    public static int findFactor(int n){

        if(n==1) {
            return 1;
        }
        if(n==0){
            return 1;
        }

        return  n*findFactor(n-1);

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