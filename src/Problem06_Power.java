// Problem 6: Power (recursive)
public class Problem06_Power {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // Output: 1024
    }
    // Time Complexity: O(n)
}