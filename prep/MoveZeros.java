package prep;

public class MoveZeros {
    public static void main (String[]args){
        int arr[]={0,10,5,0,2,9,0,7};
        int i=0, j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    
}
