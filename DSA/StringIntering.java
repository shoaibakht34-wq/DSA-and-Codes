package DSA;

public class StringIntering {
    public static boolean equals(String s3,String s4){
        if(s3.length()!=s4.length()) return false;
        for(int i=0;i<s3.length();i++){
            if(s3.charAt(i)!=s4.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="Shoaib";
        String s2="Shoaib";
        System.out.println(s1==s2);
        String s3=new String("Shoaib");
        String s4=new String("Shoaib");
        System.out.println(s3.equals(s4));
    }
}
