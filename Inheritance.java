//Inheritance- Reusability of programming code nis called inheritance.in inheritance all the used classes classified into 2 types.1 base/super/parent class 2.Derived/sub/child class
//note: extends keyword is used to inherit properties of 1 class into another class.
//note: inheritance is bottom to top programming approach.
//note: private properties of class can not be inherit.
//note: outer class can not be private.
/*types of inheritance
there are five types of inheritance
1.single inheritance
2.Hirerichal inheritance
3.*multiple inheritance
4. multilevel inheritance
5.*hybrid inheritance.
 */
 class Base{
    private int a;
    int b;//default type
    protected int c;
    public int d;
    void geta(int x){
      a=x;
    }
    void getbcd(int x, int y,int z){
        b=x;
        c=y;
        d=z;
    }
    void puta(){
        System.out.println("a="+a);
    }
    void putbcd(){
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }

 }
 class Derived extends Base{
    int e,f;
    void getef(int x,int y){
      e=x;
      f=y;
    }
    void showall(){
        System.out.println("---------------------Base class data------------------------");
        //System.out.println("a="+a); ERROR
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("---------------------Derived class data----------------------");
        System.out.println("e="+e);
        System.out.println("f="+f);
    }
 }
 public class Inheritance  {
      public static void main(String[] args) {
        Base b= new Base();
        Derived d=new Derived();
        b.geta(10);
        b.getbcd(20,30 ,40 );
        d.getbcd(55, 65, 75);
        d.getef(85, 95);
        b.puta();
        b.putbcd();
        d.putbcd();
        d.showall();

      }
}
