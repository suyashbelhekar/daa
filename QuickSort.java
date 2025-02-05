public class QuickSort {

    // Main function to perform QuickSort
    public static void quickSort(int[] arr, int start, int end) {
        if (low < high) {
            // Partitioning index (pivot element is in correct position)
            int pi = partition(arr, start, end);

            // Recursively sort elements before and after partition
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    // Partition function to place pivot element at correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot is the last element
        int i = low - 1; // Index of smaller element

        // Compare each element with pivot
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot element with arr[i + 1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 }; // Example array
        quickSort(arr, 0, arr.length - 1); // Call QuickSort

        // Print sorted array
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
