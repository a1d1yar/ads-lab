# ads-lab 1
Maratov Aldiyar se-2217

## task 1
__Description:__
>function that returns minimum from array elements

_Explanation:_
>The findMinFromArr function takes an array of integers, arr, as a parameter and returns the minimum element in the array using a for loop to compare each element in the array to a variable called minVal. If an element is smaller than minVal, it becomes the new minVal. The final value of minVal is returned as the minimum element in the array.

_Solution:_
```java
public static int findMinFromArr(int[] arr, int n) {
if (n == 1)
return arr[0];
else {
int min = findMinFromArr(arr, n - 1);
return Math.min(min, arr[n - 1]);
}
}
```

## task 2 
__Description:__
>function that returns average of array elements


_Explanation:_
>The findAverage function takes an array of integers, arr, as a parameter and returns the average of the elements in the array. The function computes the sum of the elements in the array using a for loop and then divides the sum by the length of the array.

_Solution:_
```java
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
```

## task 3
__Description:__
>function for checking
whether“n” is prime

_Explanation:_
>The isPrime function takes an integer n and an integer i as parameters, and recursively determines whether n is a prime number by checking if it is divisible by any integer from 2 up to the square root of n. The function returns "prime" if n is not divisible by any of these integers, and "not prime" otherwise. The function checks whether n is divisible by i, and if so, returns "not prime", otherwise, it calls itself with i incremented by 1. _

_Solution:_
```java
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
```
## task 4
__Description:__
>the program using recursion for
finding “n!"

_Explanation:_
>The findFactor function takes an integer n as a parameter and returns the factorial of n using recursion. The factorial of n is the product of all positive integers up to and including n, and is denoted by n!. The function is computed recursively using the formula findFactor(n) = n * findFactor(n-1), with base case findFactor(0) = 1.

_Solution:_
```java
public static int findFactor(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }

        return n * findFactor(n - 1);
    }

```
## task 5
__Description:__
>the function for finding n-th
elements in Fibonacci sequence using recursion.

_Explanation:_
>TThe findFibonacci function takes an integer n as a parameter and returns the nth Fibonacci number using recursion. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding numbers, starting from 0 and 1. The function is computed recursively using the formula findFibonacci(n) = findFibonacci(n-1) + findFibonacci(n-2), with base cases findFibonacci(0) = 0 and findFibonacci(1) = 1.

_Solution:_
```java
public static int findFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
```
## task 6
__Description:__
>the function that
returns “a^n”.

_Explanation:_
>The findPow function takes two integers, base and exponent, as parameters and returns the result of base raised to the exponent using recursion. The function is computed recursively using the formula findPow(base, exponent) = base * findPow(base, exponent-1), with base case findPow(base, 0) = 1.

_Solution:_
```java
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
```
## task 7
__Description:__
>the program that returns given array in reverse order
_Explanation:_
>The reverseArray function takes an array of integers, arr, and two indices, start and end, and reverses the order of the elements between these indices, inclusive. The function swaps the elements at the start and end indices, and recursively calls itself with the start index incremented and the end index decremented, until the start index is greater than or equal to the end index.

_Solution:_
```java
public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
```
## task 8
__Description:__
>the function for checking
whether “s” is all consists of digits__


_Explanation:_
>The isDigits function takes a String as a parameter and returns a boolean indicating whether the string contains only digits. The function recursively checks if the first character of the String is a digit, and if so, checks the remaining characters using recursion. The base cases are when the String is empty, in which case it is not composed of digits, or when it has a length of one, in which case it is composed of digits if and only if the first character is a digit.

_Solution_
```java
 public static boolean isDigits(String s) {
        if (s.length() == 0) {
            return false;
        } else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        } else {
            return Character.isDigit(s.charAt(0)) && isDigits(s.substring(1));
        }
    }
```
## task 9
__Description:__
>the program that
finds Cn
k
(binomial coefficient)

_Explanation:_
>The binomCoef function takes two integers as parameters, n and k, and returns their binomial coefficient using recursion. The binomial coefficient is the number of ways to choose k items from a set of n items, and is given by the formula n!/(k!(n-k)!), where ! denotes the factorial function. The function is computed recursively using the formula binomCoef(n,k) = binomCoef(n-1,k-1) + binomCoef(n-1,k), with base cases binomCoef(n,0) = 1 and binomCoef(n,n) = 1.

_Solution_
```java
 public static int binomCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomCoef(n - 1, k - 1) + binomCoef(n - 1, k);
        }
    }
```
 ## task 10
__Description:__
>the function for finding
GCD(a, b) using recursion.


_Explanation:_
>The function takes two integers as parameters, a and b, and returns their greatest common divisor (GCD) using the Euclidean algorithm. The algorithm repeatedly divides the larger number by the smaller number, taking the remainder at each step, until the remainder is zero, in which case the smaller number is the GCD. This algorithm works because if a is divisible by b, then b is a common factor of a and b, and if r is the remainder of a divided by b, then any common factor of a and b is also a factor of b and r. Therefore, the GCD of a and b is the same as the GCD of b and r.

_Solution:_
```java
public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
```