//wap to create a class inerest,now input values of principle ,rate,time and compute simple interest,compound interest using class and object.
import java.util.*;
class Input{
    int t;
    double p,r,SI,CI,ta;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values of p,r and t");
        p=scan.nextDouble();
        r=scan.nextDouble();
        t=scan.nextInt();
    }
        void findSI(){
        SI=p*r*t/100;
        System.out.println("simple interest=\t"+SI);
        }
        void findCI(){
        ta=p*(Math.pow((1+r/100),t));
        CI=ta-p;
        System.out.println("Compound interest=\t"+CI);
        }
    
}
public class Interest {
    public static void main(String[] args) {
        Input obj=new Input();
        obj.input();
    }
    
}
