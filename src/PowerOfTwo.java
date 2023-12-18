import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("The Power Value N");
        int n = number.nextInt();
        int fn = 2;
            if (n >0 && n <31 ){
                for (int i=1;i<=n;i++){
                    fn*=2;
                    System.out.println("2^"+i+" : "+fn);
                }
            }
    }
}
