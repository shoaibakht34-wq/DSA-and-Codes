package userpack;

public class PackSeries {
    int i;
    public void naturalSeries(int n){
        System.out.println("Natural Series");
        for(i=1;i<=n;i++){
            System.out.println(i);
        }    
        System.out.println("End of Natural Series");
        
    }
    public void evenSeries(int n){
        System.out.println("Even Series");
        for(i=2;i<=n;i=i+2){
            System.out.println(i);
        }
        System.out.println("End of Even Series");
    }
    public void oddSeries(int n){
        System.out.println("Odd Series");
        for(i=1;i<=n;i+=2){
            System.out.println(i);
        }
        System.out.println("End of Odd Series");
    }
}
