//wap to intialize an Array of 10 elements 
public class Foreachlooppattern {
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50,60,70,80,90,100};
        int sum=0, avg;
        for(int value:ar){
            System.out.println(value);
            sum=sum+value;
        }avg=sum/ar.length;
        System.out.println("sum="+sum);
        System.out.println("average="+avg);
    }
}
