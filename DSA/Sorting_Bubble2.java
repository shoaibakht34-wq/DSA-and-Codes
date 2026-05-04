package DSA;
//sort an array in descending order using bubble sort.
public class Sorting_Bubble2 {
    public static void main(String1[] args) {
        int []arr={8,5,6,3,9,4,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean isSorted= true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }if(isSorted==true){
                break;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
