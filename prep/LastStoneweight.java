package prep;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneweight {
    public static void main(String []args){
        int arr[]={2,7,4,1,8,1};
        PriorityQueue<Integer> pd=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pd.offer(ele);
        }
        while(pd.size()>1){
            int first=pd.poll();
            int second=pd.poll();
            if(first!=second){
                pd.offer(first-second);
            }
        }
        if(pd.isEmpty()){
            System.out.println(0);
        }
        else{
            System.out.println(pd.peek());
        }
    }
}
