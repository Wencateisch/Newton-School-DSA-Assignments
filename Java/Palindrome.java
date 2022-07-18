import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number");
        int n = sc.nextInt();
        int sum = 0, temp;
        temp = n;
        while (n > 0) {
            sum = (sum * 10) + n % 10;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}