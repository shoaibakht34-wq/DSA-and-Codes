package DSA;
//kth missing positive number in a sorted array.
public class Search_BinaryKth {
    public static void main(String[] args) {
        int arr[]={1,2,5,7,8};
        int k=2;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int correctNo=mid+1;
            int missing=arr[mid]-correctNo;
            if(missing==k)high=mid-1;
            else low=mid+1;
        }
        System.out.println("Missing number is:"+(high+1+k));
    }
}
