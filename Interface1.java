interface Company{
    String cname="Analyze";
    int pin=226021;// public static final
    void showdata();//public abstract
    void msg();
}
class Department{
    String dname;
    int dno;
    void getdept(int no,String name){
        dno=no;
        dname=name;
    }
}
class Employee extends Department implements Company{
    int ecode;
    String ename;
    void getemp(int code, String name){
        ecode=code;
        ename=name;
    }
    public void showdata(){ // override
        System.out.println("Company name\t"+cname);
        System.out.println("Pin code\t"+pin);
        System.out.println("Department\t"+dname);
        System.out.println("Department no\t"+dno);
        System.out.println("Employee Name\t"+ename);
        System.out.println("Employee Code\t"+ecode);
    }
    public void msg(){ //override

    }
}
public class Interface1 {
    public static void main(String[] args) {
        //Company c= new Company();//errpr
        Employee e= new Employee();
        e.getemp(1003, "jack");
        e.getdept(2, "Tech");
        e.showdata();

    }
}

