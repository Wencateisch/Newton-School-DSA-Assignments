import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int oddcount = 0, evencount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println(Math.max(evencount, oddcount));
    }
}

/*
 * Sample Input 2
 * 2
 * 1 2
 * 
 * Sample Output 2
 * 1
 * 
 * Explanation:-
 * Testcase1 :- you can remove both 2 from the array making the array equal to
 * 1,3,3. Now subtract 2 from both 3 making the array equal 1,1,1
 */