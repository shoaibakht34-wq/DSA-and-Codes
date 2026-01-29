//wap a program to
import java.io.*;
public class Bufferdreader {
public static void main(String[] args) throws IOException{
    String bname;
    int page;
    float cp,sp ;
    InputStreamReader ir= new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(ir);
    System.out.println("enter book name, pageno.:   ");
    bname= br.readLine();
    page= Integer.parseInt(br.readLine());
    System.out.println(" Enter cost and selling price:  ");
    cp= Float.parseFloat(br.readLine());
    sp= Float.parseFloat(br.readLine());
    System.out.println("Book name \t"+bname);
    System.out.println("page number\t"+page);
    if(cp>sp)
    System.out.println("loss is  "+(cp-sp));
    else if(sp>cp)
    System.out.println("profit is   "+(sp-cp));
    else
    System.out.println("no profit or no loss");
    
}
    

    
}
