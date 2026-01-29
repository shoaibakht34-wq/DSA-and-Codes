package DSA;
import java.util.Scanner;
public class Array_LinearSearch {
    public static void main(String[] args) {
    //    int[]arr={12,3,53,18,62,88,6};
      //  int x=9;
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the Array size");
      int n=scan.nextInt();;
      int[]arr=new int[n];
      System.out.println("Enter the elements of Array");
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
      }
      System.out.println("Enter the target element");
      int target=scan.nextInt();
      boolean flag=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target) {
            flag=true;
            System.out.println("Target element exist in array at the index "+i);
        }
      }
      if (flag==false) System.out.println("target element is missing");
      //if(flag==true)  System.out.println("Target element exist in array at the index");
      //else System.out.println("Target element missing in array");
    }
}
