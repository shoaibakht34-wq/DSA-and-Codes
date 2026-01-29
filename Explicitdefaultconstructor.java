//wap to compute area of triangle if value of three sides are intialized using default contructor. 
class Triangle{
    int a,b ,c;
    double s,ar;
    Triangle(){  //Explicit default constructor
       a=8;
       b=6;
       c=9;
       System.out.println("This is class triangle.");
    }
    void area(){//method
        s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle="+ar);
    }
}
public class Explicitdefaultconstructor {
     public static void main(String[] args) {
        Triangle t= new Triangle();
        t.area();
    }
}
