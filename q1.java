//wap input value of a ,b,and c swap these values

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int a,b,c;
Scanner scan= new Scanner(System.in);
System.out.println("Enter the value of A , B ");
a=scan.nextInt();
b=scan.nextInt();
   
System.out.println("value of A="+a); 
System.out.println("value of B="+b); 
   
c=a;
 
a=b;
System.out.println("after swapping value of A="+a); 
b=c;;
System.out.println("after swapping value of B="+b);
    }
}
