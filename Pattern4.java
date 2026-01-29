public class Pattern4 {
    public static void main(String[] args) {
        int i,j;
        char ch;
        for(i=97;i<=122;i++){
            for(j=97;j<=i;j++){
               ch=(char)j; 
               System.out.print(ch);
            }System.out.println();
        }
    }
    
}
