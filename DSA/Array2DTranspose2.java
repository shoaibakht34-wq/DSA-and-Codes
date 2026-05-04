package DSA;
//transpose a rectangular matrix
public class Array2DTranspose2 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6} };
        int row=arr.length,col=arr[0].length;
        int [][]brr=new int[col][row];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[0].length;j++){
                brr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<brr.length;i++){
        for(int ele:brr[i]){
            System.out.print(ele+" ");
        }
        System.out.println();
        }
    }
}
