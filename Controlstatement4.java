import java.util.Scanner;
public class Controlstatement4 {
public static void main(String[] args) {
    int i,n,sum;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=scan.nextInt();
    sum=0;
    for(i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    if(sum==n)
System.out.println("n is a perfect number.");
           else System.out.println("n is  not a perfect number.");
            
         
       
}    
}
