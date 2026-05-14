package prep;

public class ProductofArrayExcept {
    public static void main(String []args){
        int arr[]={1,2,3,4};
        int n=arr.length;
        int ans[]=new int [n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int rigth=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rigth;
            rigth=rigth*arr[i];
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
