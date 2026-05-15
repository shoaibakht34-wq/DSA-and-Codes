package prep;

public class JumpGame {
    public static void main(String []args){
        int arr[]={2,3,1,1,4};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(i>max){
                System.out.println(false);
                return;
            }
            max=Math.max(max, i+arr[i]);
        }
        System.out.println(true);
    }
}
