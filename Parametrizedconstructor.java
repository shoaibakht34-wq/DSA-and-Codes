//wap to compute area of circle if value of radius is intialize using parametrized constructor using call by value.  
class circle{
    double r,ar;
    circle(double x){
        r=x;
    }
    void area(){
        ar=Math.PI*r*r;
        System.out.println("Area of circle="+ar);
    }
}
public class Parametrizedconstructor {
    public static void main(String[] args) {
        circle c= new circle(7);
        c.area();
    }
}
