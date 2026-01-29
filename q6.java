//wap to input an amount and distribute this amount in minimum number of notes.
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        int amt;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter amount:  ");
        amt =scan.nextInt();
        System.out.println("Notes of 500="+(amt/500));
        amt=amt%500;
        System.out.println("Notes of 200="+(amt/200));
        amt= amt%200;
        System.out.println("Notes of 100="+(amt/100));
        amt= amt%100;
        System.out.println("Notes of 50="+(amt/50));
        amt= amt%50;
        System.out.println("Notes of 20="+(amt/20));
        amt= amt%20;
        System.out.println("Notes of 10="+(amt/10));
        amt= amt%10;
        System.out.println("Notes of 5="+(amt/5));
        amt= amt%5;
        System.out.println("Notes of 2="+(amt/2));
        amt= amt%2;
        System.out.println("Notes of 1="+(amt));
        
    }
    
}
