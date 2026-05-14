package prep;

import java.util.HashMap;

public class MajorityElement1 {
    public static void main(String []args){
        int arr[]={2,2,1,1,3,3,1,2,2};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                System.out.println(key);
                return;
            }
        }
        System.out.println("No majority element");
        }
}
