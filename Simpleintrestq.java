import java.io.*;
public class Simpleintrestq {
    public static void main(String[] args)throws IOException {
        int p, t;
        double r,si;
        DataInputStream ds =new DataInputStream(System.in);
        System.out.println("enter p t and r");
        p= Integer.parseInt(ds.readLine());
        t= Integer.parseInt(ds.readLine());
        r= Double.parseDouble(ds.readLine());
        si=p*t*r/100;
        System.out.println("simple intrest =  "+si);

    }
    
}
