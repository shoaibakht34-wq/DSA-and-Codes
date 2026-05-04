package DSA;
//find the first and last occurance of the target element by using binary search.
public class Search_binary2 {
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int target=5;
        int n= arr.length;
        int low=0;
        int high=n-1;
        int first=-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                last=mid;
                while(first>=0&&arr[first]==target){
                   //System.out.println("first occurance of element is at index:"+first);
                    first--;
                }
                while(last<n&&arr[last]==target){
                   // System.out.println(" Last occurance of element is at index:"+last);
                    last++;
                }
                first++;
                last--;
               System.out.println("first occurance of element is at index:"+first);
                System.out.println("Last occurance of element is at inddex:"+last);
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
