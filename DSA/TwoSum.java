package DSA;
//brute force approach
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,9,12,45,89,43,8,7};
        int target=15;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found at [" +i+ "," +j+"]");
                }
            }
        }
    }
}
