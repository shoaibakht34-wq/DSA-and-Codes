package DSA;

import java.util.Arrays;

//find a pair with given sum.
public class Sorting_pairsum {
    public static void main(String1[] args) {
        int []arr={7,0,4,2,3,8,10};
        int target=9;
        int n=arr.length;
        //sort the array in ascending order.
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println("pair found:"+arr[i]+arr[j]);
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
               // System.out.println("pair not found");
                
            }
            
        } System.out.println("pair not found");

    }
}
