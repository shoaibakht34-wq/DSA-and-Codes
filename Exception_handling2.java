// program for exception hadling using try catch.
public class Exception_handling2 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=0;
        try{
         c=a+b;
         System.out.println("Addition="+c);
         c=a-b;
         System.out.println("Subsctraction="+c);
         c=a/b;
         System.out.println("Divison="+c);
        }
        catch(ArithmeticException ae){
            System.out.println("--------------------------");
            System.out.println("Method1:It cannot divided by 0");
            System.out.println("Method2:"+ae.getMessage());
            System.out.println("Method3:"+ae);
            System.out.println("Method4:");
            ae.printStackTrace();
            System.out.println("--------------------------");
        }
        c=a*b;
        System.out.println("Multiplication="+c);
        System.out.println("End of program.");
        
    }
}

