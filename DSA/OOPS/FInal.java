package DSA.OOPS;
//understanding the concept of final and static keyword.
class Cricketer{
    final String country="India";
    static int  runs=14;
    String name;
    double avg;
}
public class FInal{
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
        Cricketer c2=new Cricketer();
       // c1.country="England"; Error because final variable can't be changed.
        System.out.println(c1.country);
        c1.runs=45;
        System.out.println(c2.runs);//because of static keyword variable becomes sharable.
    }
}
