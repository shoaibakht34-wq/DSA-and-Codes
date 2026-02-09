package DSA;

public class Anagram2 {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        int freq[]=new int[26];
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
        }
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        boolean Anagram=true;
        for(int i=0;i<26;i++){
            if (freq[i]!=0){
                Anagram=false;
                System.out.println("Not Anagram");
                break;
            }
        }
        if(Anagram){
            System.out.println("Anagram");
        }
    }
    
}
