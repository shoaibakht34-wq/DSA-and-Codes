package DSA;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
         String str1="anagram";
         String str2="nagaram";
         if(str1.length()!=str2.length()){
            System.out.println("Not anagram");
         }
         char ch1[]=str1.toCharArray();
         char ch2[]=str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         int len=ch1.length;
         int indexA=0;
         int indexB=0;
         while(indexA<len && indexB<len){
            if(ch1[indexA]!=ch2[indexB]){
                System.out.println("Not anagram");
            }
            indexA++;
            indexB++;
         }
         System.out.println("Anagram");
    }
    
}
