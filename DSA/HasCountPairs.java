package DSA;

import java.util.HashMap;

public class HasCountPairs {
    public static void main(String[] args) {
        String s="aa";
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        long pairs =0;
        for(char ch : map.keySet()){
            long freq=map.get(ch);
            pairs+=freq+freq;
        }
        System.out.println(pairs);
    }
}
