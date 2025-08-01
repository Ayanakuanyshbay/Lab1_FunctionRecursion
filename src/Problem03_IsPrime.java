// Problem 3: Prime check (recursive)
public class Problem03_IsPrime {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7, 2)); // Prime
        System.out.println(isPrime(10, 2)); // Composite
    }
    // Time Complexity: O(sqrt(n))
}