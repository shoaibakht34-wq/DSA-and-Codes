package DSA;
// search an element in a descending sorted array by using binary search.
public class Search_BinaryDescending {
   public static void main(String[] args) {
    int []arr={9,8,7,6,5,4,3,2,1};
    int target=3;
    int n=arr.length;
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            System.out.println("Target element is found at index:"+mid);
            return;
        }
        else if(arr[mid]>target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    System.out.println("Target element is not found");
   } 
}
