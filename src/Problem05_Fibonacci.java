// Problem 5: Fibonacci (recursive)
public class Problem05_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // Output: 5
        System.out.println(fibonacci(17)); // Output: 1597
    }
    // Time Complexity: O(2^n)
}