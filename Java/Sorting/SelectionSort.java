import java.util.*;
public class SelectionSort {
    public static void printArrya(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter array length : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Plese enter array elements : ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            //Time complexity = O(n^2)
            //SelectionSort
            for(int i=0; i<arr.length-1; i++){
                int smallest = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[smallest]>arr[j]){
                        smallest = j;
                    }
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            printArrya(arr);
        }
    }
}
