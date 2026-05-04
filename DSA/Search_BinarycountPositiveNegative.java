package DSA;

public class Search_BinarycountPositiveNegative {
    public static void main(String[] args) {
        int []arr={-5,-4,-3,-1,0,0,0,1,2,6,8,9,10};
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>=0) high=mid-1;
            else low=mid+1;
        }
    }
}
