// Problem 8: Check if string has only digits
public class Problem08_AllDigits {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isAllDigits("123456", 0)); // Yes
        System.out.println(isAllDigits("123a12", 0)); // No
    }
    // Time Complexity: O(n)
}