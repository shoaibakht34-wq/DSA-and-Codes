public class pg54 {
    public static void main(String[] args) {
        boolean p,q,r;
        p=true;
        q=false;
        r=q^q;
        System.out.println("p       q       p^q");
        System.out.println("__________________");
        r=p^q;
        System.out.println("true    false   |" +r);
        r=q^p;
        System.out.println("false   true    |" +r);
        r=p^p;
        System.out.println("true    true    |" +r);

    }
    
}
