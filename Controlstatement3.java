//wap to find even factors and find its sum.
import java.util.Scanner;
public class Controlstatement3 {
    public static void main(String[] args) {
        int i,n,sum;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scan.nextInt();
        sum=0;
        for(i=1;i<=n;i++){
            if(n%i==0&&i%2==0){
                System.out.println(i);
                sum=sum+i;
            }
        }System.out.println("Sum of even factors="+sum);
    }
    
}
