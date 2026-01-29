//wap to compute Simple intrest with implemention of 
//1.Default Comnstructor
//2.Call by value constructor
//3.Call by refrence constructor
class Intrest{
    int p,r,t;
    double si;
    Intrest(){
        p=1000;
        r=2;
        t=5;
    }
    Intrest(int x,int y,int z){
        p=x;
        r=y;
        t=z;
    }
    Intrest(Intrest i){
        p=i.p;
        r=i.r;
        t=i.t;
    }
    void SI(){
        si=p*r*t/100;
        System.out.println("simple intrest="+si);
    }
}
public class Parametrized3 {
    public static void main(String[] args) {
        Intrest t=new Intrest();
        Intrest t1=new Intrest(10000,4,6);
        Intrest t2 = new Intrest(t1);
        t.SI();
        t1.SI();
        t2.SI();

    }
}
