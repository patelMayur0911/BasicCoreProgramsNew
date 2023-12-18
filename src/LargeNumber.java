import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter Number1 :");
        int num1 = numbers.nextInt();
        System.out.println("Enter Number2 :");
        int num2 = numbers.nextInt();
        System.out.println("Enter Number3 :");
        int num3 = numbers.nextInt();

        if ( num1 > num2 && num1 > num3) {
                System.out.println(num1+" is Largest Among Three Numbers");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2+" is Largest Among Three Numbers");
            } else if ( num3 > num1 && num3 > num2) {
            System.out.println(num3+" is Largest Among Three Numbers");
        }
    }
}
