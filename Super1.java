class Number{
    int a=30, b=40;
}
class Data extends Number{
    int a=55,b=87;
    void show(){
        System.out.println("a="+super.a);
        System.out.println("b="+super.b);
    }
}
class value extends Data{
    int a=70,b=80;
    void showdata(){
        System.out.println("Sub class(Value)");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Super class(Data)");
        System.out.println("a="+super.a);
        System.out.println("b="+super.b);
        System.out.println("Root class(Number)");
       show();
    }
}
public class Super1 {
    public static void main(String[] args) {
        value v= new value();
        v.showdata();
    }
}
