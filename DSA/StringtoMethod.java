package DSA;

public class StringtoMethod {
    public static void change(String x){
        x="hello";
    }
    public static void main(String[] args) {
        String x="try";
        System.out.println(x);
        change(x);//not going to chnaged because is is pass by value.
        System.out.println(x);
    }
}
