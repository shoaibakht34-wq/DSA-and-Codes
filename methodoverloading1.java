// wap to find largest bwtween 2 and 3 numbers using method overlaoding.
class Number{
   void large( int a, int b){
     if (a>b)
     System.out.println("largest number="+a);
     else
     System.out.println("largest number="+b);
   }
   void large(int a, int b,int c){
    if(a>b&&a>c)
    System.out.println("Largest number="+a);
    else if(b>a&&b>c)
    System.out.println("Largest number="+b);
    else 
    System.out.println("Largest number="+c);
   }
}
public class methodoverloading1 {
    public static void main(String[] args) {
        Number n= new Number();
        n.large(9, 8);
        n.large(7, 6, 8);
    }
}
