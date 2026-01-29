//property 3 of this keyword in context of method:
/*using this keyword we can call all method of current class but java 7 and upper version also allow to call current class method without this keyword.
 */
class Display{
    void msg(){
        System.out.println("This is method msg().");
    }
    void show(){
        System.out.println("This is method show().");
    }
    void showdata(){
        System.out.println("This is class display.");
        this.msg();
        show();
    }
}
public class This4 {
    public static void main(String[] args) {
        Display d= new Display();
        d.showdata();
    }
}
