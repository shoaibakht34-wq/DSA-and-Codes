public class Command {
    public static void main(String[] args) {
        int p,t;
        double r;
        p= Integer.parseInt(args[0]);
        r= Double.parseDouble(args[1]);
    t= Integer.parseInt(args[2]);
    double s=p*t*r/100;  
        System.out.println("simple intrest="+s);
    }
    
}
