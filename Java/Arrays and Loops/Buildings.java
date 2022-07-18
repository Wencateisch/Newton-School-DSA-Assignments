import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        long currentTallest = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > currentTallest) {
                count++;
                currentTallest = arr[i];
            }
        }
        System.out.println(count);
    }
}

/*
 * Sample input:
 * 5
 * 1 2 2 4 3
 * 
 * Sample output:
 * 3
 * 
 * Explanation:-
 * the building at index 3 will hide before building at index 2 and building at
 * index 5 will hide before building at index 4
 * 
 */