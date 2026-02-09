package DSA;

public class Array_MissingElement {
    public static void main(String[] args) {
   int []arr={1,2,3,5};  
   int n= arr.length;
   int total=n+1;
   // 1 to n sum=n(n+1)/2
   int sum=total*(total+1)/2;
   for(int ele:arr){
    sum-=ele;
   }
   System.out.println(sum);
}
}
