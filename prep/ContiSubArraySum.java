package prep;

import java.util.HashMap;

public class ContiSubArraySum {
    public static void main(String []args){
        int arr[]={23,2,4,6,7};
        int k=6;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                int len=map.get(rem);
                if(i-len>=2){
                    System.out.println(true);
                    return;
                }
                }
                 else{
                    map.put(rem, i);
            }
        }
        System.out.println(false);
    }
    
}
