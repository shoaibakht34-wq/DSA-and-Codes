package DSA;

import java.util.HashSet;

//longest substring without repeating character
public class HasSubstring {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        HashSet<Character> set=new HashSet<>();
        int i=0 , j=0 , maxlen=1;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len=j-i;
                maxlen=Math.max(maxlen, len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len=j-i;
        maxlen=Math.max(maxlen, len);
        System.out.println(maxlen);
    }
}
