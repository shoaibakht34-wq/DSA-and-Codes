package DSA;

public class Sorting_selection5 {
    public static void main(String1[] args) {
        int []arr={7,3,4,7,8,1};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min= Integer.MAX_VALUE;
            int minindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min =arr[j];
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
