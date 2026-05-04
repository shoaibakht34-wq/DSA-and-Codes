package DSA;

public class StringSumSubtrings {
    public static void main(String[] args) {
        String s="45678";
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                sum=sum+Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
