//wap to find a sum of factors of number.
import java.util.Scanner;
public class Controlstatemnt2 {
    public static void main(String[] args) {
        int i,n,sum;
        Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number:");
    n= scan.nextInt();
    sum=0;
    for(i=1;i<=n;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
            System.out.println(sum);
    }
    
}
