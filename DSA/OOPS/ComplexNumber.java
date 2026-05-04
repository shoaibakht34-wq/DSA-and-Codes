package DSA.OOPS;
class Number{
    int x;
    int y;
    Number(int x, int y){
        this.x=x;
        this.y=y;
    }
    void print(){
       if(y>=0) System.out.println(x+" + "+y+"i");
       else System.out.println(x+" "+y+"i");
    }
    void add(Number n2){
      
    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        Number n= new Number(2,-5 );
        Number n2=new Number(5, 8);
        n.print();
        n2.print();
        n.add(n2);
        n2.print();
        n.print();
    }
}
