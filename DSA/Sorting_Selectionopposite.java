package DSA;
//sort the array in descending order using selection sort.
public class Sorting_Selectionopposite {
    public static void main(String1[] args) {
        int []arr={8,4,5,6,7,-1,-9,8};
        int n= arr.length;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int maxIndex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            // Swap the maximum element with the last unsorted element
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
