// wap to create a class interest ,that contains 3 variables p,r,t and method to intialize these values ,now create 2 sub classes simpinst and compundinst and calculate it.
class Interest{
    int p,r,t;
    void getdata(int x,int y,int z){
        p=x;
        r=y;
        t=z;
    }
}
class Simpinst extends Interest{
    double SI;
    void simple(){
        SI=p*r*t/100.0;
        System.out.println("Simple interest="+SI);
    }
}
class Compoundinst extends Interest{
    double ta,CI;
    void compund(){
        ta=p*(Math.pow((1+r/100),t));
        CI= ta-p;
        System.out.println("Compound interest="+CI);
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Simpinst s= new Simpinst();
        Compoundinst c= new Compoundinst();
        s.getdata(7000,5,4);
        c.getdata(7000,500,4);
        s.simple();
        c.compund();
    }
}
