//wap a program to compute 1 of following operation 
//1.Simple interest
//2.Compound interest
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        double p,r,t,CI,ta,SI;
        int ch;
        Scanner scan= new Scanner(System.in);
        System.out.println("1.simple intrest\n 2.compund intrest");
        System.out.println("Enter the choice between given two choices.");
ch=scan.nextInt();
switch (ch) {
    case 1:
    System.out.println("Enter the value of p,r,and t:");
    p=scan.nextDouble();
        r=scan.nextDouble();
        t=scan.nextDouble();
        SI=p*r*t/100;
        System.out.println("Simple interest="+SI);
        break;
case 2:
System.out.println("Enter the value of p r and t:");
p=scan.nextDouble();
r=scan.nextDouble();
t=scan.nextDouble();
ta=p*(Math.pow((1+r/100),t));
        CI= ta-p;
        System.out.println("compound intrest="+CI); break;
    default:System.out.println("wrong choice enter the right choice.");
        break;
}
    }
}
