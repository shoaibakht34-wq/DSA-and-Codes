//program to enter a ch and check that it is vowel or not.
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the character:");
        ch=scan.next().toUpperCase().charAt(0);
        if (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.println("Its vowel.");
        else System.out.println("its consonent.");

    }
    
}
