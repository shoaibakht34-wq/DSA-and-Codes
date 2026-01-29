//wap to input values of a,d,n of AP series using constructor and generate APseries
import java.util.*;
class Apseries{
    int a,d,n,i,T;
    Apseries(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the value of a,d,n:");
    a=scan.nextInt();
    d=scan.nextInt();
    n=scan.nextInt();
    }
    void printAP(){
System.out.println("---------------AP series--------------");
     for(i=0;i<n;i++){
        T=a+i*d;
        System.out.println(T);
     }
    }
    

}
public class Expplicitdefault1 {
    public static void main(String[] args) {
        Apseries ap=new Apseries();
        ap.printAP();
    }
}
