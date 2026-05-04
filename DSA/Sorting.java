package DSA;
//check if array is sorted or not.
public class Sorting {
    public static void main(String1[] args) {
        int []arr={1,0,2,3,4,5,6};
        boolean Sort=true;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                Sort=false;
                break;
            }
        }
        System.out.println(Sort);
    }
}
