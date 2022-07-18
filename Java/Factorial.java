import java.util.Scanner;

public class Factorial {
    public static void factorial(int number){
        if(number<0){
            System.out.println("Invalid Number");
        }
        int factorial = 1;
        for(int i=number; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);
    }
}
