package DSA;

public class Search_BinaryArranging_coins {
    public static void main(String[] args) {
        int n=7;
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int k=low+(high-low)/2;
            int m=k+(k+1)/2;
            if(m==n) System.out.println("Arranged number:"+k);
            else if(m>n) high=k-1;
            else ans=k;low=k+1;
        }
        System.out.println("Arranged number:"+ans);
       // System.out.println("Arranged number:"+(int)(Math.sqrt(8*n+1)-1)/2);
    }
}
