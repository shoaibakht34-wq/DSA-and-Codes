//for loop is updated version of while loop.
/*working of for looop first intializaton: it is run one time when the loop starts
test conditon: it is run every time before entering in loop block(if condition is true)
updation : increment or decerement it will run every time after the completion of loop block. 
wap a program to enter a number and calculate its factorial value.*/
import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        int n,i;long f=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the nummber");
        n=scan.nextInt();
        for(i=1;i<=n;i++);{
            f=f*i;
        }
        System.out.println("Factorial="+f);
    }
    
}
