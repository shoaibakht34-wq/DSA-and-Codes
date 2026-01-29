// wap to add two number and take the same name of instance and local variable. 
class Number{
    int a,b ;
    void getdta(int a, int b){
        this.a=a;
       this.b=b;
    }
    void add(){
        System.out.println("Value1="+a);
        System.out.println("value2="+b);
        int c=a+b;
        System.out.println("Addition="+c);
    }
}
public class This2 {
    public static void main(String[] args) {
        Number n = new Number();
        n.getdta(7,8 );
        n.add();
    }
}
