package DSA;
// Bubble sort.
public class Sorting_Bubble {
    public static void main(String1[] args) {
        int []arr={3,5,1,4,2,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}
