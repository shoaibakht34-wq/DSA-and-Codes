package DSA;
//character hashing which includes upper and lower case letters
public class Hashing2 {
    public static void main(String[] args) {
        String str="Shoaib Akhtar";
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)(i)+" "+freq[i]);
            }
        }
    }
}
