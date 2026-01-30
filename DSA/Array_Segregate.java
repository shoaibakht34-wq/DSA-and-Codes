package DSA;
//segerating 0's in the left and 1's in the right
public class Array_Segregate {
    public static void main(String[] args) {
       int []arr={0,1,0,1,1,0,0,1,0};
      // int numberofzeros=0;
      // int numberofones=0;
       //for(int ele:arr){
        //if(ele==0){
          //  numberofzeros++;
        //}else{numberofones++;
//
  //        }  }
   //           for(int i=0;i<numberofzeros;i++){
     //   arr[i]=0;
    //   }
   //    for(int i=numberofzeros;i<numberofzeros+numberofones;i++){
   //     arr[i]=1;
  //     }
 //      for(int element:arr){
   //     System.out.print(element+" ");
   //    }  
         int n=arr.length;
         int i=0;
         int j=n-1;
         while(i<j){
            if (arr[i]==0)i++;
           else if(arr[j]==1)j--;
           // if(i>j)break;
           else if(arr[i]==1&&arr[j]==0){
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
         }
         for(int ele:arr){
            System.out.print(ele+" ");
         }
    }
    
    }

