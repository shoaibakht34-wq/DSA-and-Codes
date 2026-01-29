//wap a program to innput employee name employee code employee salary//
import java.io.*;
public class Datainputstream {
    public static void main(String[] args)throws IOException {
      int code;
      String name;
        float salary;
        DataInputStream ds= new DataInputStream(System.in);
        System.out.println("enter employee code ,name ,salary:");
        code= Integer.parseInt(ds.readLine());
        name =ds.readLine();
        salary=Float.parseFloat(ds.readLine());
        System.out.println("employee name: "+name);
        System.out.println("employee code: "+code);
        System.out.println("employee salary: "+salary);

    }
    
}
