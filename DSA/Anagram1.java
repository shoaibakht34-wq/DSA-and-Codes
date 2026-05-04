package DSA;

import java.util.Arrays;

//check whether the given string is anagram or not.
public class Anagram1 {
    public static void main(String[] args) {
        String s1="Listen";
        String s2="Silent";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())System.out.println("Not anagram");
         char ch1[]=s1.toCharArray();
         char ch2[]=s2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         int index1=0;
         int index2=0;
         int n=ch1.length;
         while(index1<n && index2<n){
            if(ch1[index1]!=ch2[index2]){
                System.out.println("Not Anagram");
                return;
            }
            index1++;
            index2++;
         }
         System.out.println("Anagram");
    }
}
