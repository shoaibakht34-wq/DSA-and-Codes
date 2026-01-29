// wap to create a class dimension,now compute area of circle,square,rectangle,triangleusing method overloading.
class Dimension{
    double ar,s;
    void area(double r){
        ar=Math.PI*r*r;
        System.out.println("Area of circle="+ar);
    }
    void area(int a){
        ar=a*a;
        System.out.println("Area of square="+ar);
    }
    void area(int a, int b){
       ar=a*b;
       System.out.println("Area of Rectangle="+ar);
    }
    void area(int a,int b, int c){
        s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle="+ar);
    }
}
public class methdod_overloadingcomiletimepolymorphism {
    public static void main(String[] args) {
      Dimension d= new Dimension();
      d.area(7.0);
      d.area(8);
      d.area(7, 8);
      d.area(7, 8, 9);
    }    
}
