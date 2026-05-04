package DSA;

public class Array2D {
    public static void main(String[] args) {
        int [][]arr={{6,0,3,7},{1,3,7,2},{9,9,4,5}};
        int sum=0;
        System.out.println(arr.length+" "+arr[0].length);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
           System.out.println();
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
