package DSA;

import java.util.Arrays;

public class String_NonReapting {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch[i+1]){
                System.out.println("Non repeating character:"+ch[i]);
                return;
            }
           // else {
               // System.out.println("No non repeating character found. ");
              //  return;
            //}
        }
        System.out.println("No non repeating character found. ");
    }
}
