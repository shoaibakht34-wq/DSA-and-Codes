// wap to input three sides of shape (w,h,d) of a shape and compute its area (if Area=2(wh+hd+dw))
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
       int w,h,d, Area;
       Scanner scan= new Scanner(System.in) ;
       System.out.println("Enter the value of w , h and d :");
       w=scan.nextInt();
       h=scan.nextInt();
       d=scan.nextInt();
Area= 2*(w*h+h*d+d*w);
System.out.println("Area of the Shape ="+Area);
    }
}
