package DSA;
//Reaversing a part of array
public class Array_Reverse2 {
    public static void main(String[] args) {
        int []arr={3,4,5,2,8,9,3,1,7,6};
        int n= arr.length;
        int i=2,j=6;
        while(i<j){
          int temp= arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        for(int ele:arr)
            System.out.print(ele+" ");
    }
    
}
