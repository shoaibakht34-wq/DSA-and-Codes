package DSA;

public class Minvalue_in_Array {
    public static void main(String[] args) {
        int[]arr={3,2,8,4,9,1,4};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }
    
}
