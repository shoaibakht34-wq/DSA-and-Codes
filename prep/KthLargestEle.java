package prep;

import java.util.PriorityQueue;

public class KthLargestEle {
    public static void main(String []args){
        int arr[]={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.offer(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
