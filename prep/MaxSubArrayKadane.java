package prep;


public class MaxSubArrayKadane {
    public static void main(String []args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int ele:arr){
            sum=sum+ele;
            if(sum>maxSum) maxSum=sum;
            if(sum<0)sum=0;
        }
        System.out.println(maxSum);
    }
}
