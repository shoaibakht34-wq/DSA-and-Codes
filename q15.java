import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        int Ec,B;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the employee code");
        Ec=scan.nextInt();
        switch (Ec) {
            case 100:
            System.out.println("Bonus=5");
                
                break;
                case 200:
                System.out.println("Bonus=1");
                break;
                case 300:
                System.out.println("Bonus=2");
                break;
                case 400:
                System.out.println("Bonus=25");
        break;
            default:System.out.println("wrong employee code.");
                break;
        }
    }
    
}
