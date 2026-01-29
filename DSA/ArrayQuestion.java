package DSA;
//Multiply odd indexed elements by 2 and 10 to even indexed elements
public class ArrayQuestion {
    public static void main(String[] args) {
        int[]arr= {2,1,3,4,5,67,2};
        for(int i=0;i<arr.length;i++){
            if(i%2==1) System.out.print(arr[i]*2+" ");
            else System.out.print(arr[i]*10+" ");
        }
    }
    
}
