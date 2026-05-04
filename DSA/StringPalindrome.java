package DSA;
//check the given string is palidrome or not.
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not a palindrome.");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
