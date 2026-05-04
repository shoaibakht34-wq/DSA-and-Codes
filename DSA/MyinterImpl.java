package DSA;

public class MyinterImpl implements Myinter {
   @Override
    public void sayHello(){
    System.out.println("I am saying hello from MyInterImpl");
    //MyinterImpl myinter=new MyinterImpl();
    //yinter.sayHello();
   //Myinter i=new Myinter() {
    //public void sayHello(){
      //  System.out.println("1st anonymous class");
    //}
   //};
   //i.sayHello(); 
   //using our interface with the help of lambda.
   Myinter i=()->{
    System.out.println("this is first time i am using lambda");
   };
   i.sayHello();
   }
}
