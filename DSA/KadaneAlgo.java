package DSA;
//brute force approach
public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int max_sum=0;
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum=curr_sum+arr[j];
                if(curr_sum>max_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println(max_sum);
    }
}
