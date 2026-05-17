package prep;

public class HouseRobber {
    public static void main(String[]args){
        int arr[]={2,7,9,3,1};
        int prev=0;
        int prev1=0;
        for(int ele:arr){
            int current=Math.max(prev1,ele+prev);
            prev=prev1;
            prev1=current;
        }
        System.out.println(prev1);
    }
}
