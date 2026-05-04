package DSA;

import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(6);
        //System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.append("akhtar");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.setCharAt(2, 'm');
        System.out.println(sb);
        String t=sb.toString();
        System.out.println(t);

    }
}
