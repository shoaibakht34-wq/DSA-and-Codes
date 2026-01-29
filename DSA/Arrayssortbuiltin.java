package DSA;
import java.util.Arrays;
public class Arrayssortbuiltin {
    public static void main(String[] args) {
        int []arr={3,1,2,-10,7,6};
        print (arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr){
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
