// property 2 of super keyword: context of method-> using super keyword we can call parametrized constructor of super class , to call parametrized constructor of super class the statemnet must be written inside the constructor as first statement.
class Company{
    Company(int x){
     System.out.println("Parametrized constructor of class company.");
    }
}
class Employee extends Company{
   Employee(){
    super(10);
    System.out.println("Default constructor of class Employee.");
   }
}
public class Constructor_in_inheritance1 {
    public static void main(String[] args) {
        Employee emp1= new Employee();
       
    }
}
