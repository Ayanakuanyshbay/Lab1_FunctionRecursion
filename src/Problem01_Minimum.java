// Problem 1: Minimum in array
public class Problem01_Minimum {
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println(findMinimum(arr)); // Output: 1
    }
    // Time Complexity: O(n)
}