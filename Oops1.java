// wap to create a class circle ,now enter radius and compute Area,Circumfrence.
import java.util.Scanner;
class Circle{
    double r,ar,cr;//these are instaance variable.
    void input(){// x is local variable.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius:");
        r=scan.nextDouble();
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("Area of circle="+ar);
    }
    void circumfrence(){
        cr=2*Math.PI*r;
        System.out.println("Circumfrence of circle="+cr);
    }
}
public class Oops1 {
    public static void main(String[] args) {
        Circle obj =new Circle();
        obj.input();
        obj.area();
        obj.circumfrence();
    }
    
}


