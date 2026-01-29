public class pg26 {
    public static void main(String[] args) {
        int x,y;
        x=1;
        y=++x;
        System.out.println("x="+x+ "y="+y);
        x=1;
        y=x+1;
        System.out.println("x="+x+ "y="+y);
        y=1;
        y=x+ x++;
        System.out.println(y);
        x=1;
        y=x++ +y;
        System.out.println(y);
    }
    
}
