// wap to CREate a class data that contains 3 variables a,d,n and method for intializaton ,now creates a subclass Apseries to print respective series.
class Data{
    int a,d,n;
    void getdata(int x, int y, int z){
     a=x;
     d=y;
     n=z;
    }
}
class Apseries extends Data{
    int T,i;
    void printAp(){
        System.out.println("AP series");
        for(i=0;i<n;i++){
       T=a+i*d;
       System.out.println(T);
        }
    }
}
class Gpseries extends Data{
    int T,i;
    void printgp(){
        System.out.println("GP series");
        for(i=0;i<n;i++){
            T=(int)(a*Math.pow(d,i));
            System.out.println(T);
        }
    }
}
public class Inheritance4 {
    public static void main(String[] args) {
        Apseries ap= new Apseries();
        Gpseries gp=new Gpseries();
        ap.getdata(7,6,5);
        gp.getdata(7,6,5);
        ap.printAp();
        gp.printgp();
    }
}
