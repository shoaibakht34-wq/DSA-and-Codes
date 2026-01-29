//wap to input 2 numbers and find addition, multiplication of the two numbers.
import java.util.Scanner;
class Number{
int a,b,c;
void input(){
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter two numbers. :");
    a= scan.nextInt();
    b=scan.nextInt();
}
void add(){
    c=a+b;
    System.out.println("Addition ="+c);
}
void multi(){
    c=a*b;
    System.out.println("Multiplication="+c);
}
}
public class Addition {
    public static void main(String[] args) {
        Number obj=new Number();
        obj.input();
        obj.add();
        obj.multi();
    }
}
