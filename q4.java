//wap to input 2 sides of rectangle and compute its area
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        double length, width,Area;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of length and width");
        length=scan.nextDouble();
        width=scan.nextDouble();
Area= length*width;
System.out.println("Area of Rectangle =   "+Area);
    }
    
}
