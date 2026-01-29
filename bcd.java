public class bcd {
    public static void main(String[] args) {
        int x=1, y=2;
        System.out.println(x<y);
        boolean boo1, boo2;
        boo1= x<y;
        boo2=false;
        System.out.println(boo1 && boo2);
        System.out.println(boo1|| boo2);
        System.out.println(!boo2);
        byte b;
        short s=257;
        b=(byte)s;
        System.out.println(b);
        float f =1.0f/3.0f;
        double d= 1.0/3.0;
        System.out.println(f);
        System.out.println(d);
        d=3.999999;
        long lg;
        lg =(long)d;
        System.out.println(lg);
    }
    
}
