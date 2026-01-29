//wap to input a number and finds its factor
import java.util.Scanner;
public class qustion {
    public static void main(String[] args) {
        int n,i;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scan.nextInt();
        System.out.println("Factors are:");
        for(i=1;i<=n;i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
            
        
    }


    
}
