class Base{
    int a=10;
    void display(){
        System.out.println("this is base class method.");
        System.out.println("a="+a);
    }
}   
    class Derived extends Base{
        int b=20;
        void display(){
            System.out.println("This is derived class method.");
            System.out.println("a="+a);
            System.out.println("b="+b);

        }
        void showdata(){
            super.display();
            display();
        }
    }

public class Methodoverriding_runtimepolymorphism {
    public static void main(String[] args) {
        Derived d= new Derived();
        d.showdata();
    }
}
