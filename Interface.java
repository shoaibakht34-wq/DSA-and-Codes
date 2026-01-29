//interface is a pure abstract/declarative class that can not have its own objects.
//an interface is implemented by another class using implements keyword , and it should be declared using interface keyword
//a class that implements an interface , it must override all the methods of interface. 
interface Company{
    String cname="Analyze";
    int pin=226021;// public static final
    void showdata();//public abstract
    void msg();
}
class Employee implements Company{
    int ecode;
    String ename;
    void getemp(int code, String name){
        ecode=code;
        ename=name;
    }
    public void showdata(){ // override
        System.out.println("Company name\t"+cname);
        System.out.println("Pin code\t"+pin);
        System.out.println("Employee Name\t"+ename);
        System.out.println("Employee Code\t"+ecode);
    }
    public void msg(){ //override

    }
}
public class Interface {
    public static void main(String[] args) {
        //Company c= new Company();//errpr
        Employee e= new Employee();
        e.getemp(1003, "jack");
        e.showdata();

    }
}
