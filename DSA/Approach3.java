package DSA;
//marking in another array.
public class Approach3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,6};
        boolean []visited = new boolean[arr.length];
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(visited[arr[i]]==true){
                System.out.println("Duplicate element is :"+arr[i]);
            }
            visited[arr[i]]=true;
        }

    }
}
