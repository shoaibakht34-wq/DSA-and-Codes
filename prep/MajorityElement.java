package prep;

public class MajorityElement {
    public static void main(String[]args){
        int arr[]={2,2,1,1,1,1,2,2,2};
        int count=0;
        int can=0;
        for(int ele:arr){
            if(count==0){
                can=ele;
            }
            if(ele==can) count++;
            else count--;
        }
        System.out.println(can);
    }
    
}
