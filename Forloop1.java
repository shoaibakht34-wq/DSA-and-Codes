import java.util.Scanner;
public class Forloop1 {
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
