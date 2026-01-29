//wap to input book nmae page no cost and selling price using scanneer class now print book name pagenumber and profit or loss
import java.util.*;
public class Scannerinput {
    public static void main(String[] args) {
        
        String bname ;
        int pageno;
        float cp,sp;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter book name and page number:");
        bname=scan.next();
        pageno=scan.nextInt();
        System.out.println("Enter cost and selling price: ");
        cp=scan.nextFloat();
        sp=scan.nextFloat();
        System.out.println("Book name\t"+bname);
        System.out.println("page number\t"+pageno);
        if(sp>cp)
        System.out.println("profit\t"+(cp-sp));
        else if(cp>sp)
        System.out.println("loss\t"+(cp-sp));
        else
        System.out.println("no profit and no loss");

    }
    
}
