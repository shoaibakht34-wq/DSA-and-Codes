package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayAddingOne {
   public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(9);
    arr.add(9);
    arr.add(9);
    int carry=1;
    int n = arr.size();
    for(int i=n-1;i>=0;i--){
        if(arr.get(i)+carry<=9){
             arr.set(i,arr.get(i)+carry);
             carry=0;
        }
        else{
            arr.set(i,0);
            carry=1;
        }
    }
    if (carry==1) arr.add(1);
    Collections.reverse(arr);
    System.out.println(arr);

   }
}
