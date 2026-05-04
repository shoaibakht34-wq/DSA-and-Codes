package DSA;
//search peak element index in a mountain array by using binary search.
public class Search_BinaryMountain {
    public static void main(String1[] args) {
        int []arr={1,2,5,8,9,19,18,17,16,2};
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>0&&mid<n-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    System.out.println("Peak element is foound at index:"+mid);
                    return;
                }
                else if(arr[mid-1]>arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(mid==0){
                if(arr[0]>arr[1]){
                    System.out.println("Peak element is found at index:"+0);
                    return;
                }
                else{
                    System.out.println("Peak element is found at index:"+1);
                    return;
                }
            }
            else{
                if(arr[n-1]>arr[n-2]){
                    System.out.println("Peak element is found at index:"+(n-1));
                    return;
                }
                else{
                    System.out.println("Peak element is found at index:"+(n-2));
                    return;
                }
            }
        }
        System.out.println("Peak element is not found");
    }
}
