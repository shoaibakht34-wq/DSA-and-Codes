import java.util.Scanner;
public class Controlstatemnet4 {
    public static void main(String[] args) {
        int i,n,sum;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the nummber:");
        n=scan.nextInt();
        sum=0;
        for(i=1;i<=n;i++){
            if(n%i==0&&i%2==1){
            System.out.println(i);
            sum=sum+i;
         } }System.out.println("sum of odd factors="+sum);
    }
    
}
