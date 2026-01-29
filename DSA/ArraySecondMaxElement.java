package DSA;
//Print the second Maximum element in the array
public class ArraySecondMaxElement {
    public static void main(String[] args) {
        int[]arr= {7,1,12,14,67,54,8};
        int Max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max)
                Max=arr[i];
        }//caluclate max
        //System.out.println(Max);
        //calculate second Max
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=Max)
                smax=arr[i];
        }
        System.out.println(smax);
    }
    
}
