package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervels {
    public static void main(String []args){
        int arr[][]={{1,3},{2,6},{8,10},{9,12}};
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]>result=new ArrayList<>();
        int []current=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=current[1]){
                current[1]=Math.max(current[1], arr[i][1]);
            }else{
                result.add(current);
                current=arr[i];
            }
        }
        result.add(current);
        for(int []ele:result){
            System.out.println(Arrays.toString(ele));
        }
    }
}
