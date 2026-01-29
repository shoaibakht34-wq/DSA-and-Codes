import java.util.Scanner;
public class ArrayTakinginput {
    public static void main(String[] args) {
    //int arr[]={50,40,30,20,67,78,54,98};
    //System.out.println(arr.length);
    //for(int i=0;i<arr.length;i++){
      //  System.out.print(arr[i]+" ");
    //}
    int arr[]=new int[7];
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt(); 
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]*2+" ");
    }
 }
}
