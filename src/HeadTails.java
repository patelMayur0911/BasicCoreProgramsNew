import java.util.Random;
import java.util.Scanner;

public class HeadTails {
    public static void main(String[] args) {
        Scanner sysinp = new Scanner(System.in);
        System.out.println(" Number time you want to fli the coin : ");
        int n = sysinp.nextInt();
        int h = 0;
        int t = 0;
        if (n > 0) {
            for (int i = 1; i<=n; i++){
                Random rn = new Random();
                double drn = Math.random() ;
                    if (drn < 0.5){
                        System.out.println(i+" Tails");
                        t++;
                    }else{
                        System.out.println(i+" Head");
                        h++;
                    }
            }
            System.out.println(h + " times head from " + n);
            double Output = (double)  h / n  ;
                Output*=100;
            System.out.println("Percentage of Head vs Tails : " + Output + "%" );
        } else {
            System.out.println("please enter >o :");
        }
    }
}