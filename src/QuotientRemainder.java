import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter Number1 :");
        int num1 = numbers.nextInt();
        System.out.println("Enter Number2 :");
        int num2 = numbers.nextInt();

        System.out.println("Quotient num1 / num2 :" + num1/num2);
        System.out.println("Remainder num1 % num2 :" + num1 % num2);

    }
}
