package DSA;
//array list is a growing array which resolve the issue of fixed size in array it is known as growing array and it has collections framework.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        //printing all elements
        System.out.println(arr);
        //printing any one element of array
        System.out.println(arr.get(1));
        //updating any element of array
        arr.set(3,50);//now arr[3]=50
        System.out.println(arr.get(3));
        System.out.println(arr);
        int n=arr.size();//arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+"  ");
        }
        for(int ele:arr){
            System.out.println(ele);
        }
        //25,21,50,18,10
        arr.add(78);// adding 78 at last index
        System.out.println(arr);
        arr.add(1,100 );// adding 100 at the index 1
        System.out.println(arr);
        arr.remove(arr.size()-1);//removing last element of the array
        System.out.println(arr);
        // reversing the elements of array
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        //Collections.reverse(arr);
        System.out.println(arr);
       // ArrayList<String> arr2=new ArrayList<>();
        //ArrayList<Character>arr3=new ArrayList<>();

    }
    
}
