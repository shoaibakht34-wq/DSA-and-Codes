package DSA;

public class Sorting_Selection {
    public static void main(String1[] args) {
        int []arr={8,4,1,9,-3,6,5};
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }  
        for(int ele:arr){
            System.out.print(ele+" ");
        } 
    }
    
}
