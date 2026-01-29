package DSA;
import java.util.Scanner;
public class Array_twosum {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the Array size");
       int n=scan.nextInt(); 
        int arr[]=new int[n];
        System.out.println("Emter the elements of Array");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the target value");
        int target= scan.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    found=true;
                    System.out.println("["+i+","+j+"]");
                }
            }
        } if(found==false)System.out.println("pairs of element not found");
    }
}
