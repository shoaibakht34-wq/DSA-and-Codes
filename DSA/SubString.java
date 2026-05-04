package DSA;

public class SubString {
    public static void main(String[] args) {
        String s="Anwarul";
        System.out.println(s.substring(0,5));
        //print all substring
        String s1="Shoaib";
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
            System.out.print(s1.substring(i,j+1)+" ");
           }
           System.out.println();
        }
    }
}
