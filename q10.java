//wap to input three numbers and find the ssecond largest number
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter three numbers:  ");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if (a>b&&a>c){if (b>c)System.out.println("2nd largest ="+b);
        else System.out.println("2nd largest"+c);}
        else if(b>c){
            if (a>c) System.out.println("2nd largest ="+a);
            else System.out.println("2nd largest ="+c);
        }else {
            if (a>b)System.out.println("2nd largest ="+a);
            else System.out.println("2nd largest = "+b);
        }
    }
    
}
