// program of exception handling using finally keyword.
public class Exception_handling1 {
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
        finally{
        c=a*b;
        System.out.println("Multiplication="+c);
        }
        System.out.println("End of program.");
        
    }
}

