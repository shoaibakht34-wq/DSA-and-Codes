package DSA;
//given an array of size n+1 consisting of integersfromt 1 to n one of the element is duplicate in the array find that deuplicate element.
public class Approach1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,6};
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i]; 
        }
        int expectedSum = (n-1)*(n)/2;
        System.out.println("Duplicate element is: "+(sum-expectedSum));
           
    }
}
