//a loop within loop is called nested loop.
/*wap to print following pattern.
*
**
***
****
*****  */
public class Nestedloopingpattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)//row
        {
         for(j=1;j<=i;j++)//column
         {
            System.out.print("*");
         }  System.out.println(); 
        }
    }
}
