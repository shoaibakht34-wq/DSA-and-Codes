// wap tp create a class dimension that contains 2 sides , and method to assign theses values, Now create Rectangle and triangle to compute area of respective shapes.
class Dimension{
    int a,b;
    void getdata(int x, int y){
        a=x;
        b=y;
    }
}
class Rectangle extends Dimension{
    int ar;
    void arearect(){
    ar=a*b;
    System.out.println("Area of rectangle="+ar);
}
}
class Triangle extends Dimension{
    double ar;
    void areatri(){
        ar=a*b/2.0;
        System.out.println("Area of Rectangle="+ar);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        r.getdata(8, 9);
        t.getdata(7,6);
        r.arearect();
        t.areatri();
    }
}
