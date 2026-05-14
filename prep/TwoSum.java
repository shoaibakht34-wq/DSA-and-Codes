package prep;

public class TwoSum {
    public static void main(String[]args){
        int arr[]={2,7,11,15,23,87,495};
        int target=34;
        int i=0, j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println("Pair found:"+arr[i]+","+arr[j]);
                break;
            }
            else if(sum<target)i++;
            else j-- ;
        }

    }
    
}
