package DSA;

import java.util.HashSet;

public class HashTwoSum {
    public static void main(String[] args) {
        int arr[]={1,3,-1,8,4,2};
        int target=17;
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            int rem=target-ele;
            if(set.contains(rem)){
                System.out.println(true);
                return;
            }
            set.add(ele);
        }
        System.out.println(false);
    }
}
