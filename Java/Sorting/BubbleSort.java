import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (// int arr[] = { 7, 8, 3, 1, 2 };
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter array size :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Please enter array elements :");
            for(int i = 0; i<arr.length; i++){

                arr[i] = sc.nextInt();
            }

            // time complexity O(n^2)
            // Bubble Sort
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            printArray(arr);
        }
    }

}
