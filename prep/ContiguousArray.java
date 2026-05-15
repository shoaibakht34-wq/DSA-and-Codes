package prep;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String []args){
        int arr[]={0,1,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum=sum-1;
            }else{
                sum=sum+1;
            }
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxLen=Math.max(maxLen, len);
            }else{
                map.put(sum, i);
            }
        }
         System.out.println(maxLen);
    }
}
