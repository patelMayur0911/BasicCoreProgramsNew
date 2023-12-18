import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("4 dig year : ");
        int yy = inputs.nextInt();
        if (yy<1000){
            System.out.println("I said it must be in 4 digit ");
        }else {
        if (yy%4==0){
            if (yy%100!=0){
                System.out.println(yy+" is Leap Year");
            }else if (yy%400==0){
                    System.out.println(yy+" is Leap Year");
                }
            } else {
            System.out.println(yy+" is Not Leap Year");
        }
        }
    }
}
