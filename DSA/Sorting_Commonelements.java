package DSA;

import java.util.Arrays;

//find common elements in unsorted arrays.
public class Sorting_Commonelements {
    public static void main(String1[] args) {
        int []a={7,0,4,2,3,8,10};
        int []b={3,2,7,6,0,8,10};
        int []c= new int[Math.min(a.length,b.length)];
        int n=a.length;
        int m=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i]==b[j]){
                c[i]=a[i];
                System.out.print(c[i]+" ");
            }
        }
        }
    }
}
