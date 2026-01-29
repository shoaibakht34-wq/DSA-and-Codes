
import java.io.*;

public class Twonumbwe {
    public static void main(String[] args)throws IOException {
        int a ,b ;
        DataInputStream ds= new DataInputStream(System.in);
        System.out.println("enter a and b:  ");
        a= Integer.parseInt(ds.readLine());
        b= Integer.parseInt(ds.readLine());
        int c= a+b;
        System.out.println("a+b="+c);
    }
}
