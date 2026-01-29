public class c2e7 {
    public static void main(String[] args) {
        int x,y;
        x=1;
        x++;
        System.out.println("x++;changes x from 1 to"+x);
        x=1;
        ++x;
        System.out.println("++x; x changes from 1 to"+x);
        x=1;
        y=x++;
System.out.println("y=x++ changes x from 1 to "+x);
System.out.println("y=x++;assigns" +y );
x=1;
y=++x;
System.out.println("y=++x ;chnages x from 1 to "+x);
System.out.println("y=++x; assigns y"+y);
    }
    
}
