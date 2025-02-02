package DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        bubbleSort(array);

        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Perform passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, break the loop
            if (!swapped) {
                break;
            }
        }
    }
}
