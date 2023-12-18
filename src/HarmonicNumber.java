import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("n for H_n :");
        int n = number.nextInt();
        double fn = 0;
        for ( int i =1; i<=n;i++){
            fn = fn + 1.0 / i ;
        }
        System.out.println("Nth Harmonic Value :"+fn);
    }
}
