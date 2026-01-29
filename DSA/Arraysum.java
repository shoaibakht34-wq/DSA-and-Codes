package DSA;
import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
       sum=sum+arr[i];
        }
        System.out.println("Sum of the element of Array="+ sum);
    }
    
}
