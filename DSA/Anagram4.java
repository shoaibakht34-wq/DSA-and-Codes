package DSA;

import java.util.Arrays;

//most frequent character 2nd method.
public class Anagram4 {
   public static void main(String[] args) {
       String s="transceacktztzt";
       char ch[]=s.toCharArray();
       Arrays.sort(ch);
       int n =ch.length;
       int maxfreq=-1;
       char ans=s.charAt(0);
       int i=0;
       int j=0;
       while(j<n){
        if(ch[i]==ch[j])j++;
        else{
            int freq=j-i;
            if(freq>maxfreq){
                maxfreq=freq;
                ans=ch[i];
            }
            i=j;
        }
       }
       int freq=j-i;
       if(freq>maxfreq){
        maxfreq=freq;
        ans=ch[i];
       }
       System.out.println(ans);
   }
}