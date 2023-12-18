import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Number n : ");
        int fn = number.nextInt();
        if ((fn % 2) == 0) {
            System.out.println(fn + " is Even number");
        } else {
            System.out.println(fn + " is Odd number");
        }
    }
}
