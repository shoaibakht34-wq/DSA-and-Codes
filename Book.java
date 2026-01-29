//wap to create a class book ,now input book name ,page number,cost,selling priceand print book name,page number with profit or loss.
import java.util.*;
class Bookname{
    String bname;
    int pno;
    double cp,sp;
    static int count=1;
    void getdata(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter book name ");
        bname=scan.next();
        System.out.println("Enter page no. :");
        pno=scan.nextInt();
        System.out.println("Enter cost price:");
        cp=scan.nextDouble();
        System.out.println("Enter selling price:");
        sp=scan.nextDouble();

    }
    void putBook(){
        System.out.println("Book name=\t"+bname);
        System.out.println("Page number=\t"+pno);
    
        if(sp>cp)
        System.out.println("Profit="+(sp-cp));
    
        if(cp>sp)
        System.out.println("Loss="+(cp-sp));
        else System.out.println("No profit or No loss.");
        count++;
}}
public class Book {
    public static void main(String[] args) {
        Bookname b1=new Bookname();
        Bookname b2=new Bookname();
        Bookname b3=new Bookname();
        b1.getdata();
        b1.putBook();
        
        
        b2.getdata();
        b2.putBook();
        
        
        b3.getdata();
        b3.putBook();
        
        

    }
    
}
