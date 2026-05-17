package prep;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String []args){
        int arr[]={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int ele:map.keySet()){
            pq.offer(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
