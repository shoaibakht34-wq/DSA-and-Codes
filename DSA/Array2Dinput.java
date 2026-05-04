package DSA;
import java.util.Scanner;
public class Array2Dinput {
    public static void main(String[] args) {
        int[][]arr=new int[3][4];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
    }
}
