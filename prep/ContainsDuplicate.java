package prep;

public class ContainsDuplicate {
    public static void main(String []args){
        int arr[]={2,3,1,8,3,5,4};
        boolean ans=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=true;
                    break;
                }
            }
            if(ans)break;
        }
        System.out.println(ans);
    }
}
