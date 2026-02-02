package DSA;

public class Slidingwindow {
   public static void main(String[] args) {
    int arr[]={3,8,2,5,7,6,12};
    int  w=4;
    int n =arr.length;
    int current =0;
    for(int i=0;i<w;i++){
        current=current + arr[i];
    }
    int max= current;
    for(int i=1;i<=n-w;i++){
        current = current-arr[i-1]+arr[i+w-1];
        if(current>max){
            max= current;
        }
    }
    System.out.println(max);
   } 
}
