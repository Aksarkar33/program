import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter the size of array:");
        // Read size of array
        int n = scanner.nextInt();

        // Edge case handling
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] array = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize max with first element
        int max = array[0];

        // Find maximum element
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Output result
        System.out.println("Maximum element: " + max);

        scanner.close(); 
    }
}