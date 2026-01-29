import java.util.Scanner;
public class Employeedetails {
    public static void main(String[] args) {
        int code;
        String name;
        float salary;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter emloyee details:");
         code=scan.nextInt();
         name=scan.next();
         salary=scan.nextFloat();
         System.out.println("Employee code=  "+code);
         System.out.println("employee name=  "+name);
         System.out.println("employee salary="+salary);
    }

    
}
