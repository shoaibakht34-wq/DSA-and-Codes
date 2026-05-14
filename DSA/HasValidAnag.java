package DSA;

import java.util.HashMap;

public class HasValidAnag {
   public static void main(String[] args) {
    String s1="talent";
    String s2="latent";
    if(s1.length()!=s2.length()){
        System.out.println(false);
        return;
    }
    HashMap<Character, Integer>map=new HashMap<>();
    for(int i=0;i<s1.length();i++){
        char ch= s1.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(int i=0;i<s2.length();i++){
        char ch=s2.charAt(i);
        if(!map.containsKey(ch)){
            System.out.println(false);
            return;
        }
        int freq=map.get(ch);
        if(freq==0){
            System.out.println(false);
            return;
        }
        map.put(ch, freq-1);
    }
    System.out.println(true);
   } 
}
