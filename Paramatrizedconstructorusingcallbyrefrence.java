//program to demonstration of call by refrence constructor.
class Data{
    int a,b;
    Data(){
        a=10;
        b=20;
        System.out.println("Data is created.");
    }
    Data(Data D){
        a=D.a;
        b=D.b;
        System.out.println("Dupplicate copy of Data is created.");
    }
    void swap(){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    void showdata(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
public class Paramatrizedconstructorusingcallbyrefrence {
    public static void main(String[] args) {
        Data D1=new Data();
        Data D2=new Data(D1);
        D1.swap();
        System.out.println("Swap Data");
        D1.showdata();
        System.out.println("Actual Data.");
        D2.showdata();
    }
    
}
