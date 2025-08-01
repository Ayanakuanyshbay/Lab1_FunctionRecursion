// Problem 2: Average of array
public class Problem02_Average {
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        System.out.println(findAverage(arr)); // Output: 2.5
    }
    // Time Complexity: O(n)
}

