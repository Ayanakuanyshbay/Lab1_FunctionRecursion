// Problem 9: Binomial coefficient C(n, k)
public class Problem09_BinomialCoefficient {
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    public static void main(String[] args) {
        System.out.println(binomial(2, 1)); // 2
        System.out.println(binomial(7, 3)); // 35
    }
    // Time Complexity: O(2^n)
}
