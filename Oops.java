// wap to create a class circle ,now enter radius and compute Area,Circumfrence.
class Circle{
    double r,ar,cr;//these are instaance variable.
    void input(double x){// x is local variable.
        r=x;
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
public class Oops {
    public static void main(String[] args) {
        Circle obj =new Circle();
        obj.input(7.5);
        obj.area();
        obj.circumfrence();
    }
    
}
