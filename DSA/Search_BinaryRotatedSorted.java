package DSA;
//Search an element in sorted and rotated array.
public class Search_BinaryRotatedSorted {
    public static void main(String1[] args) {
        int []arr={5,6,7,8,9,10,1,2,3};
        int target=10;
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){ 
                System.out.println(mid);
                return;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[mid]<target&& target<=arr[high])low=mid-1;
                else high=mid-1;
            }
        }
        System.out.println("Target element not found.");
    }
}
