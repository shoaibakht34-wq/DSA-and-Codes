//wap to create class table,input a number and prints its table using class and object.
import java.util.*;
class Number{
int n,i;
void input(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=scan.nextInt();
    for(i=1;i<=10;i++){
       System.out.println(i*n );
    }
}
}
public class Table {
    public static void main(String[] args) {
       Number obj=new Number();
       obj.input();
    }
}
