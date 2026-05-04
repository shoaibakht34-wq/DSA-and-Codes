package DSA;
//lambda is anonymous function 1.no name 2.no modifier 3.no return type
//it reduces the lines of code.
//sequential and parallel support by passing behaviour as an argument in methods.
//to call APIs very effectively.
//To write more readable,maintainable and concise code.
public class Lambda  {

    public static void main(String[] args) {
       System.out.println("My System starts..");
       Myinter myinter=new MyinterImpl();
       //using our interface with the help of lambda
       Myinter i=()->{System.out.println("this is first time i am using lambda");};
       i.sayHello();
       Myinter i2=()->{System.out.println("this is second time i am using lambda");};
       i2.sayHello();
       SumInter sumInter=( a, b)->  a+b;
       System.out.println(sumInter.sum(2, 6));
       System.out.println(sumInter.sum(4, 7));

       LengthInter l=(str->str.length());
       System.out.println(l.getLength("Shoaib Akhtar"));
    }
}
