package DSA;
import java.util.Scanner;
public class ArrayOutput {
    public static void main(String[] args) {
  //      int arr[]={5,-8,2,67,43,-97};
   //     for(int i=0;i<arr.length;i++){
   //         System.out.print(arr[i]+" ");
   //     }
      int []zaid=new int[7];
      Scanner sc= new Scanner(System.in);
   //   for(int i=0;i<arr.length;i++){
     //   System.out.print(zaid[i]+" ");
      //}
      System.out.println("Enter the Elements");
      //input
      for(int i=0;i<7;i++){
        zaid[i]=sc.nextInt();
      }
      //print
      for(int i=0;i<7;i++){
        System.out.print(zaid[i]+" ");
      }
    }
    
}
