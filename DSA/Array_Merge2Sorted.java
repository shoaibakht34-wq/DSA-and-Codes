package DSA;
// there is elements in the 2 array that are in the sorted form so merge them  in a array which has a size of 1array +2array and the elements are represented in sorted form.
public class Array_Merge2Sorted {
    public static void main(String[] args) {
        int []a={2,5,6,9};
        int []b={1,3,4,5,7,9};
        int []c= new int[a.length+b.length];
        merge(c,a,b);
        for(int ele:c){
            System.out.print(ele+" ");
            //System.out.println();
        }
        System.out.println();
        
    }
    public static void merge(int[]c,int[]a,int[]b){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
                
                
            }
            else{
                c[k++]=b[j++];
                
            }
        }
                while(i<a.length){
                    c[k++]=a[i++];
                    

                }
                while(j<b.length){
                    c[k++]=b[j++];
                }
            
        
    }
    
}
