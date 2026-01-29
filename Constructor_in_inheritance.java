class Company{
    Company(){
        System.out.println("This is default constructor of class company.");
    }
}
class Employee extends Company{
    Employee(){
        System.out.println("Default constructor of class Employee.");
    }
    Employee(int x){
        System.out.println("Parametrized constructor of class Employee.");
    }
}
public class Constructor_in_inheritance {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        Employee emp2=new Employee(7);
    }
}
