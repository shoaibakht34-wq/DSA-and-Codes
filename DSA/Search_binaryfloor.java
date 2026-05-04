package DSA;
//search the floor of the element in a sorted array by using binary search.
public class Search_binaryfloor {
    public static void main(String[] args) {
        int []arr={1,2,8,10,10,12,19};
        int target=11;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Floor of the target element is:"+mid);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                floor=mid;
                low=mid+1;
            }
        }
        System.out.println("Floor of the target element is:"+floor);
    }
}
