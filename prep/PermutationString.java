package prep;

import java.util.Arrays;

public class PermutationString {
    public static void main(String []args){
        String s1="ab";
        String s2="eidbaooo";
        if(s1.length()> s2.length()){
            System.out.println(false);
            return;
        }
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1, count2)){
            System.out.println(true);
            return;
        }
        for(int i=s1.length();i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(count1, count2)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
