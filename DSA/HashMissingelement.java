package DSA;

import java.util.ArrayList;
import java.util.HashSet;

public class HashMissingelement {
    public static void main(String[] args) {
        int arr[]={10,12,11,15};
        int low=arr[0];int high=arr[0];
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
          set.add(ele);
        }
        for(int ele:arr){
            if(ele<low) low=ele;
            if(ele>high) high=ele;
        }
          for(int i=low;i<=high;i++){
            if(!set.contains(i)) ans.add(i);
          }
          System.out.println(ans);
    }
}
