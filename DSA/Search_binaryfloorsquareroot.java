package DSA;
//search the floor of the square root of a number by using binary search.
public class Search_binaryfloorsquareroot {
    public static void main(String[] args) {
        int n=11;
        int low=0;
        int high=n;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==n){
                System.out.println("Floor of the square root of the number is:"+mid);
                return;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            else{
                floor=mid;
                low=mid+1;
            }
        }
        System.out.println("Floor of the square root of the number is:"+floor);
    }
}
