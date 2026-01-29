//wap to input 2 numbers and find largest elemnet using conditional oprator
import java.util.Scanner;
public class Binaryoperator{
public static void main(String[] args) {
    int a,b;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter A:");
    a=scan.nextInt();
    System.out.println("Enter B:");
    b=scan.nextInt();
    int res=(a>b)?a:b;
    System.out.println("Resut:  "+res);
    /*if (a>b)
    System.out.println(a);
    else
    System.out.println(b);/* */
}
    
}
