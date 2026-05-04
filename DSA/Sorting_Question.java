package DSA;
//Move all zeros to end of array by maintaing the order of non zero element by using bubble sort.
public class Sorting_Question {
    public static void main(String1[] args) {
        int []arr={0,1,2,3,78,0,9,76,0,98};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
