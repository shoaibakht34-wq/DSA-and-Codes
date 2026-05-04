package DSA;
//find the kth smallest element in the array.
public class Sorting_kthelemnt {
    public static void main(String1[] args) {
        int []arr={4,5,6,7,9,3,2,1,9};
        int k=4;
        int n= arr.length;
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int minindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        System.out.println(k+"th smallest element is:"+arr[k-1]);
    }
}
