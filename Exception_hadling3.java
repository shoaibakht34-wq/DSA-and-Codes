// program for excption handling using multiple catch
import java.util.*;
public class Exception_hadling3 {
    public static void main(String[] args) {
        int ar[]=new int[10];
        int index,n;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the index and element");
            index= scan.nextInt();
            n=scan.nextInt();
            ar[index]=n/index;
            System.out.println("Success.............");
        }
        catch(ArithmeticException ae){
            System.out.println("invalid index");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of program.");
        }
    }

