import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        Scanner Alpha = new Scanner(System.in);
        System.out.println("Enter Alphabet :");
        char ch = Alpha.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Given Alphabet is an Vowel");
            } else {
                System.out.println("Given Alphabet is a Consonant");
            }
        } else {
            System.out.println("you can only pass alphabet");
        }
    }
}

