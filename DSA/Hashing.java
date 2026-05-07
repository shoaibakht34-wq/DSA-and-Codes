package DSA;
//count the frequency of number by using hashing.
public class Hashing {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int freq[]=new int [10];
            for(int i=0;i<arr.length;i++){
                freq[arr[i]]++;

            }
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    System.out.println(i+" "+freq[i]);
                }
            }
    }
}
