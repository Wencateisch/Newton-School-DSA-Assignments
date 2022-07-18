import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n / 3;
        if (n % 3 == 2) {
            ans++;
        }
        System.out.print(ans);
    }
}

/*
 * Sample Input 2
 * 8
 * 
 * Sample Ouput 2
 * 3
 * 
 * Explanation;-
 * testcase1;- 2 flower will be white,yellow
 * so number of yellow flower is 1
 */