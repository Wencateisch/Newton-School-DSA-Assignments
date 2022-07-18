import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1;
		System.out.print("Enter a Number : ");
		int count = sc.nextInt();
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
		}
	}
}