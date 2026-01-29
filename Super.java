//super keyword: it refers the object of super class , super keyword is used to access data and properties of super class , super keyword always implemnted in inheritance.
/*properties 1 of super keyword in context of variable.
it is allowed that we can same variable name in super/base and drived/ super class 
 */
class Number{
    int a=30, b=40;
}
class value extends Number{
    int a=70,b=80;
    void showdata(){
        System.out.println("Sub class(Value)");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Super class(Number)");
        System.out.println("a="+super.a);
        System.out.println("b="+super.b);
    }
}
public class Super {
    public static void main(String[] args) {
        value v= new value();
        v.showdata();
    }
}
