package prep;

import java.util.HashSet;

public class ContainsDuplicate1 {
    public static void main(String []args){
        int arr[]={2,3,1,8,3,5,4};
        HashSet<Integer> set=new HashSet<>();
        boolean ans=false;
        for(int ele: arr){
            if(set.contains(ele)){
                ans=true;
                break;
            }
            set.add(ele);
        }
        System.out.println(ans);
    }
    
}
