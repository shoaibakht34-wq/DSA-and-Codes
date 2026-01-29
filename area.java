//wap to find 1 of fllowing operation according user choice
//1. area of circle 2.area of recatngle.3 area of sqaure.4.area oftraiangle
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        double a,b,c,s,ar;
        int ch;
        Scanner scan= new Scanner(System.in);
        System.out.println("1. Area of circle\n 2.Area of Rectangle\n 3.Area of square/n 4.Area of triangle");
        System.out.println("Enter the choice(1to4)");
        ch=scan.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Enter the Radius. :");
            a=scan.nextDouble();
            ar=Math.PI*a*a;
                System.out.println("Area of circle=  "+ar);
                break;
        case 2:
        System.out.println("Enter the width and length:");
        a=scan.nextDouble();
        b=scan.nextDouble();
        ar=b*a;
        System.out.println("Area of Rectangle=  "+ar);
        break;
        case 3:
        System.out.println("Enter the side of square:  ");
        a=scan.nextDouble();
        ar=a*a;
        System.out.println("Area of square=   "+ar);break;
        case 4:
        System.out.println("Enter the three sides of trinagle: ");
        a= scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle=  "+ar);break;
            default:System.out.println("wrong choice enter the right choice.");
                break;
        }
    }
    
}
