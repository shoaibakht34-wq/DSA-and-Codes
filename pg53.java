public class pg53 {
    public static void main(String[] args) {
        boolean p,q,r;
        p=true;
        q=false;
        r=!(q||q);
        System.out.println(" p      q      !(q||q)");
        System.out.println("___________________");
        System.out.println("false   false   |" +r);
        r=!(q||p);
        System.out.println("false  true   |" +r);
        r=!(p||q);
        System.out.println("true   false   |" +r);
        r=!(p||p);
        System.out.println("true  true    |" +r);
    }
    
}
