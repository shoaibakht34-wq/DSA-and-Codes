package prep;

import java.util.HashSet;

public class TwoSum2 {
    public static void main(String[] args) {
        int arr[]={2,9,8,7,3,5};
        int target=13;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: arr){
            int rem=target-ele;
            if(set.contains(rem)){
                System.out.println("Pair Found:"+ele+","+rem);
                return;
            }
            set.add(ele);
        }
        System.out.println("Pair not found");
    }
}
