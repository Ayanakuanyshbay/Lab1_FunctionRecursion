// Problem 10: GCD using Euclidean algorithm (recursive)
public class Problem10_GCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(32, 48)); // Output: 16
        System.out.println(gcd(10, 7)); // Output: 1
    }
    // Time Complexity: O(log(min(a, b)))
}
