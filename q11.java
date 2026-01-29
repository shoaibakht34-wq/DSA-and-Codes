//wap to input cofficient (a,b,c) of quadaratic equation and compute its roots.
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        int a,b,c; double d,r1,r2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a ,b and c:");
        a= scan.nextInt();
        b=scan.nextInt();
        c= scan.nextInt();
        d=b*b-4*a*c;
        if(d>0){
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("root 1 =  "+r1);
            System.out.println("Root2 =  "+r2);
        }else if (d==0){
            r1=-b/(2*a);
            System.out.println("both roots are   "+r1);
        }else {
            System.out.println("no real roots.");
        }
    }
    
}
