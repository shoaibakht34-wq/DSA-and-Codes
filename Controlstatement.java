//wap to find the factors of a number.
import java.util.Scanner;
public class Controlstatement {
    public static void main(String[] args) {
        int i ,n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
          if(n%i==0)System.out.println(i);
        }
    }
    
}
