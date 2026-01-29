//wap to input 3*4 matrix and find sum columnwise
import java.util.Scanner;
public class arraycolumnwise {
    public static void main(String[] args) {
        int a[][]=new int[3][4];
        int i,j;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a matrix of 3*4 order:");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                a[i][j]=scan.nextInt();
            }
        }
        for(j=0;j<4;j++){
            
            for(i=0;i<3;i++){
                int sum=0;
                sum=sum=a[i][j];

            }
            System.out.println("sum of column"+j+"="+sum);
        }
    }
    
}
