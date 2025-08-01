// Problem 7: Reverse array (recursive, no array structure)
public class Problem07_ReverseArray {
    public static void reverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverse(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};
        reverse(arr, arr.length - 1); // Output: 2 6 4 1
    }
    // Time Complexity: O(n)
}