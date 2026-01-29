package DSA;
import java.util.Scanner;
public class Arraynegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    //printing negative values
    for(int i=0;i<n;i++)
        if(arr[i]<0) System.out.print(arr[i]+" ");
    }
    
}
