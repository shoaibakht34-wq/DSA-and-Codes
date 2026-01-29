//wap to initialize an array of 10 elements that contains positive and negative number.Now print all elements with sum of positive elements ,sum of negative elements .
public class foreachloop2 {
    public static void main(String[] args) {
        int ar[]={10,20,30,-10,-20,-30,50,60,70,-80};
        int sumpos=0,sumneg=0;
        for(int value:ar){
            System.out.println(value);
            if(value<0){
            sumneg=sumneg+value;
              }if(value>0){
                sumpos=sumpos+value;
              }
              }
        System.out.println("Sum of positive numbers="+sumpos);
        System.out.println("Sum of negative numbers="+sumneg);
    }
}
