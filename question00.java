//wap to print tables of 1 to n.
import java.util.Scanner;
public class question00 {
    public static void main(String[] args) {
        int i,j,n,t;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=10;j++){
                t=i*j;
                System.out.print(t+"\t");
            }

            System.out.println();
        }
    }
}
