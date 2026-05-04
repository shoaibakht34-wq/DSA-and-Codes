package DSA;
//2nd approach of bubble sort.
public class Sorting_Bubble1 {
    public static void main(String1[] args) {
        int []arr={5,4,3,2,1};
        int n = arr.length;
       for(int i=0;i<n-1;i++){
         boolean isSorted=true;
         for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isSorted=false;
            }
         }
         if(isSorted){
            break;
         }
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
