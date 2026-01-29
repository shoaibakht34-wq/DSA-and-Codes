package DSA;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[]={6,4,5,-8,9,4,98,76,54};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
    
}
