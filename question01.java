//wap to print 1 to n prime number series.
import java.util.Scanner;
public class question01 {
    public static void main(String[] args) {
        int i,j,n,s;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scan.nextInt();
        for(i=2;i<=n;i++){
            s=0;
            for(j=2;j<i;j++){
             if(i%j==0){
                s++;
             }
            }
        }
    }
}
