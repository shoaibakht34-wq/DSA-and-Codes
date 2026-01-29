//wap toinput 2 numbrs and find 1 0r following operation according user's choice 1.Addition 2.substraction 3.Multiplication 4.Divison
import java.util.Scanner;
public class selectivestatemnet {
    public static void main(String[] args) {
        int a,b,res,ch;
Scanner sc =new Scanner(System.in);
System.out.println("enter two numbers.");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("1.Addition");
System.out.println("2.Substraction");
System.out.println("3.Multiplication");
System.out.println("4.Divison");
ch=sc.nextInt();
switch(ch){
case 1 :
{
    res=a+b;System.out.println("Addition ="+res);break;
}
case 2: {res=a-b ; System.out.println("Substraction="+res);break;}
case 3: {res=a*b;System.out.println("Multipilication="+res);break;}
case 4:{res=a/b;System.out.println("Divison="+res);break;}
case 5:{System.out.println("Wrong choice ,try again.");}
}
    }
    
}
