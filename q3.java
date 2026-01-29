//wap to input values of p ,r and t and compute value of compoud intrest
import java.util.Scanner;
import java.lang.Math;
public class q3 {
    public static void main(String[] args) {
        double p,r, CI,ta;int t;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the value of p  r  t :");
        p=scan.nextDouble();
        r=scan.nextDouble();
        t=scan.nextInt();
        ta=p*(Math.pow((1+r/100),t));
        CI= ta-p;
        System.out.println("Compound intrest=   "+CI);

    }

    
}
