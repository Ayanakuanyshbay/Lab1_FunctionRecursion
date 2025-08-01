public class Main {
    public static void main(String[] args) {

        // Problem 1: Minimum
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("Problem 1 - Minimum: " + Problem01_Minimum.findMinimum(arr1));

        // Problem 2: Average
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Problem 2 - Average: " + Problem02_Average.findAverage(arr2));

        // Problem 3: Prime Check
        System.out.println("Problem 3 - Is 7 Prime? " + Problem03_IsPrime.isPrime(7, 2));
        System.out.println("Problem 3 - Is 10 Prime? " + Problem03_IsPrime.isPrime(10, 2));

        // Problem 4: Factorial
        System.out.println("Problem 4 - 5! = " + Problem04_Factorial.factorial(5));

        // Problem 5: Fibonacci
        System.out.println("Problem 5 - Fibonacci(5): " + Problem05_Fibonacci.fibonacci(5));
        System.out.println("Problem 5 - Fibonacci(17): " + Problem05_Fibonacci.fibonacci(17));

        // Problem 6: Power
        System.out.println("Problem 6 - 2^10 = " + Problem06_Power.power(2, 10));

        // Problem 7: Reverse Array
        int[] arr3 = {1, 4, 6, 2};
        System.out.print("Problem 7 - Reversed Array: ");
        Problem07_ReverseArray.reverse(arr3, arr3.length - 1);
        System.out.println();

        // Problem 8: All Digits
        System.out.println("Problem 8 - \"123456\" All Digits? " + Problem08_AllDigits.isAllDigits("123456", 0));
        System.out.println("Problem 8 - \"123a12\" All Digits? " + Problem08_AllDigits.isAllDigits("123a12", 0));

        // Problem 9: Binomial Coefficient
        System.out.println("Problem 9 - C(2,1) = " + Problem09_BinomialCoefficient.binomial(2, 1));
        System.out.println("Problem 9 - C(7,3) = " + Problem09_BinomialCoefficient.binomial(7, 3));

        // Problem 10: GCD
        System.out.println("Problem 10 - GCD(32,48): " + Problem10_GCD.gcd(32, 48));
        System.out.println("Problem 10 - GCD(10,7): " + Problem10_GCD.gcd(10, 7));
    }
}
