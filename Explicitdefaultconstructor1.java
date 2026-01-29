// wap to create a class intrest now input values of principle ,rate ,time using default constructor and compute simple and compound interest using methods.
import java.util.*;
class Interest{
    int t;
    double p,r,SI,CI, ta;
    Interest(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values of p, r and t:");
        p=scan.nextDouble();
        r=scan.nextDouble();
        t=scan.nextInt();
    }
        void simple(){
         SI=p*r*t/100;
         System.out.println("Simple interest="+SI);
    } 
    void compound(){
        ta=p*(Math.pow((1+r/100),t));
        CI= ta-p;
        System.out.println("Compound interest="+CI);
    }
}
public class Explicitdefaultconstructor1 {
    public static void main(String[] args) {
        Interest i=new Interest();
        i.simple();
        i.compound();
    }
}
