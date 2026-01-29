import java.util.Scanner;
public class Binaryoperator1 {
 public static void main(String[] args) {
    int a ,b , c;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the three numbers");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
   int  res=(a>b)?((a>c)?a:c):((b>c)?b:c);
   System.out.println("Gretaest number is:  "+res);
 }
    
}
