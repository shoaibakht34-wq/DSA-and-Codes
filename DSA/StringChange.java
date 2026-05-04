package DSA;
import java.util.Scanner;
public class StringChange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        if(s.charAt(0)>='a'&&s.charAt(0)<='z'){
         System.out.println(s.toLowerCase());
        }
        else System.out.println(s.toUpperCase());
    }
}
