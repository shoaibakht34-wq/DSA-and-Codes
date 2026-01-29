// wap to input radius of circle and compute area and circumference.
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        float r;
        
        Scanner scan= new Scanner(System.in);;
        System.out.println("enter te radius of circle:  ");
        r= scan.nextFloat();
System.out.println("circumference ="+r*2*3.14);
System.out.println("Area ="+r*r*3.14);
    }
    
}
