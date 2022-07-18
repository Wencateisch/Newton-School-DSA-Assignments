import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator = sc.next().charAt(0);
        // char op = sc.next().charAt(1);
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default : System.out.println("Invalid Operand");
        }
    }
}
