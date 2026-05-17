package prep;

public class ClimbingStairs {
    public static void main(String []args){
        int n=5;
        if(n<=2){
            System.out.println(2);
            return;
        }
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
