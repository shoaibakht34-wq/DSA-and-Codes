//using switch find vowel or consonent.
import java.util.Scanner;
public class vowelsswitch {
    public static void main(String[] args) {
        char ch;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Character:  ");
        ch=scan.next().toUpperCase().charAt(0);
        switch(ch){
            case'A':
            case'E':
            case'I':
            case'O':
            case 'U':
            System.out.println("Its vowel.");
            break;
            default:System.out.println("Its consonent.");
        }
    }
    
}
