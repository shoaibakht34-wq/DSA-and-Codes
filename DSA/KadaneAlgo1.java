package DSA;
//better approach
public class KadaneAlgo1 {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum=Math.max(arr[i], curr_sum + arr[i]);
            max_sum=Math.max(max_sum, curr_sum);
        }
        System.out.println(max_sum);
    }
}
