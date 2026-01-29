//wap to input a matrix of 3*4 order and print its transpose matrix.
import java.util.Scanner;
public class ArrayMatricsmultilication2 {
    public static void main(String[] args) {
        int a[][]= new int[3][4];
        int b[][]=new int[3][4];
        int c[][]=new int[3][4];
        int i,j,k;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Matrix1 of 3*4 order");
        
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
               a[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the Matrix2of 3*4 order");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                b[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[j][k];
                }
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
