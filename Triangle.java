import java.util.Scanner;
import java.lang.Math;
public class Triangle {
    public static void main(String[] args) {
        int a,b,c;
        double s,area;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three sides of triangle a b and c:");
        a=scan.nextInt();
        b= scan.nextInt();
        c=scan.nextInt();
        s =(a+b+c)/2;
        System.out.println("value of the S=\t"+s);
         area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("So the area of triangle is\n Area=  "+area);


        
    }
    
}
