import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        int a,b ,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a= scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if (a>b&&a>c)System.out.println("A is the greatest number.");
        else if (b>a&&b>c)System.out.println("B is the greatest number.");
        else System.out.println("C is the greatest number.");
    }
}
