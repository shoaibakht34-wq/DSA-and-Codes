package DSA;
//search the single element among the doubles in a sortrd array by using binary search.
public class Search_binarysinglesamongdoubles {
    public static void main(String1[] args) {
        int []arr={1,1,2,3,3,4,4,8,8};
        if(arr.length==1) System.out.println(arr[0]);
        int n=arr.length;
        int low=0;
        int high=n-1;
        if(arr[0]!=arr[1])System.out.println(arr[0]);
        if(arr[n-1]!=arr[n-2])System.out.println(arr[n-1]);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>0&&mid<n-1){
               if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                System.out.println("Single elment is found at index:"+mid);
                return;
               }
               int f=mid,s=mid;
               if(arr[mid-1]==arr[mid])f=mid-1;
               else s=mid+1;
               int leftCount=f-low;
               int rightCount=high-s;
               if(leftCount%2==0)low=s+1;
               else high=f-1;
            }
        }
        System.out.println("Singlr element not found.");
    }
}
