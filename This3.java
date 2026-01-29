//Property 2 of this keyword context of constructor:
/*using this keyword wwe can call the current class constructor.
to call the current class constructor using this keword the statement must be wriiten inside constructor in first line.
 */
class Number{
    int a,b;
    Number(){
        this(70);
        System.out.println("Constructor1");
    }
    Number(int x){
        this(x,80);
        System.out.println("Contsructor2");
    }
    Number(int x, int y){
        a=x;
        b=y;
        System.out.println("Constructor3");
    }
    void showdata(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
 public class This3 {
    public static void main(String[] args) {
        Number n= new Number();
        n.showdata();
        
    }
}
