package DSA;

import java.util.HashSet;

public class HashMapDistinctelements {
    public static void main (String[]args){
    int arr[]={12,2,3,2};
    HashSet<Integer> set = new HashSet<>();
    for(int ele:arr) set.add(ele);
    System.out.println(set.size());
}
}