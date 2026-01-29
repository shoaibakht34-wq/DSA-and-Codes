//wap to input a number and check that it is -ve or +ve or 0
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        int a;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number :  ");
        a= scan.nextInt();
        if (a<0) System.out.println("a is a negative number.");
             
             else if(a>0)System.out.println("a is positive number.");
             else System.out.println("a is a zero.");
            
        }
    }
    

