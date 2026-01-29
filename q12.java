//wap to input 3 numbers and find smallest element
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter three numbers:  ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if (a<b&&a<c)
        System.out.println("Smallest number ="+a);
        else if (b<c)
        System.out.println("Smallest number ="+b);
        else
        System.out.println("Smallest number ="+c);
    }
    
}
