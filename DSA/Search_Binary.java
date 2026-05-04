package DSA;
// find the target element is present or not by using bianry search.
public class Search_Binary {
    public static void main(String[] args) {
        int []arr={-76,-4,9,28,47,510,615,9911,99999};
        int target=9;
        int n = arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Target element is found at index:"+mid);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Target element is not found");
    }
}
