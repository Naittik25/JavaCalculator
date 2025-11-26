
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number :");
        int num1 = sc.nextInt();

        System.out.println("Second Number :");
        int num2 = sc.nextInt();

        int add = num1 + num2;

        int sub = num1 - num2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction  = " + sub);

        sc.close();
    }
}
