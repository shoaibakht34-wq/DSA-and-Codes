package prep;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String []args){
       int arr[]={1,1,1};
       int k=2;
       HashMap<Integer, Integer> map=new HashMap<>();
       int prefixSum=0;
       int count=0;
       map.put(0,1);
       for(int ele:arr){
        prefixSum+=ele;
        if(map.containsKey(prefixSum-k)){
            count+=map.get(prefixSum-k);
        }
        map.put(prefixSum, map.getOrDefault(prefixSum,0 )+1);
       }
       System.out.println(count);
    }
}
