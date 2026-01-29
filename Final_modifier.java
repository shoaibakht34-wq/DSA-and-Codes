// final variable must be intialize at the time of declaration and once it is initialize , it cannot be change.
//final int a; error
// final int a=10; right
//a=20; error          PI is static and final type.
class Number{
    int a=30, b=40,d;
    final int c=10;
}
class value extends Number{
    int a=70,b=80,d=10;
    
    void showdata(){
        
        System.out.println("Sub class(Value)");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Super class(Number)");
        System.out.println("a="+super.a);
        System.out.println("b="+super.b);
    }
}
public class Final_modifier {
    public static void main(String[] args) {
        value v= new value();
        v.showdata();
    }
}

