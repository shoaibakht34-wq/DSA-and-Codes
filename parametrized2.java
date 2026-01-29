// wap to find area of shape if formula is Area=2(wh+hd+dw),in this program also implement 
//1.Default constructor
//2.Parameterized Constructor call by value 
//3.Parametrized constructor call by refrence
class Value{
    int w,h,d,ar;
    Value(){
        d=10;
        w=15;
        h=12;
    }
    Value(int x,int y,int z){
       w=x;
       h=y;
       d=z;
    }
    Value(Value V){
      w=V.w;
      h=V.h;
      d=V.h;
    }
    void area(){
        ar=2*(w*h+d*h+d*w);
        System.out.println("Area of Shape="+ar);
    }
}
public class parametrized2 {
    public static void main(String[] args) {
        Value v1=new Value();
        Value v2=new Value(9,10,11);
        Value v3=new Value(v2);
        v1.area();
        v2.area();
        v3.area();
    }
}
