import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Want PrimeFactor till Number N :");
        long n = number.nextInt();
        for (int i = 2; i*i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if ( n >1 ){
            System.out.print(n);
        }
    }
}