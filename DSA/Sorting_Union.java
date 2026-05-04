package DSA;
//find uninon of two sorted arrays.
public class Sorting_Union {
    public static void main(String1[] args) {
        int []a={1,2,3,4,5};
        int []b={1,2,3,6,7};
        int []c=new int[a.length+b.length];
        int n = a.length;
        int m=b.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else if(a[i]>b[j]){
                c[k++]=b[j++];
            }
            else{
                c[k++]=a[i++];
                j++;
            }
        }
        while(i<n){
            c[k++]=a[i++];
        }
        while(j<m){
            c[k++]=b[j++];
        }
        for(int l=0;l<k;l++){
            System.out.print(c[l]+" ");
        }
    }
}
