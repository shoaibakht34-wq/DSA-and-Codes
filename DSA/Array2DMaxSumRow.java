package DSA;
//find the row with maximum sum
public class Array2DMaxSumRow {
    public static void main(String[] args) {
        int[][]arr={{2,6,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{9,9,4,5,3}};
        int maxSum=Integer.MIN_VALUE;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            //maxSum=Math.max(maxSum, sum);
            if(sum>maxSum){
                maxSum=sum;
                row=i;
            }
        }
        System.out.println(row+" "+maxSum);
    }
}
