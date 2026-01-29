//this keyword- this keyword refers the object of current class.
// this keyword is not responsible to create the object of current class,this keyword only contains the object of current class. 
/* Properties of this keyword
1.property1-Context of variable
it is allowed that we can have local and instance variable with same name inside a class ,then using this keyword we can access instamce variable 
 inside local block.
 */
class Data1{
    int a=10, b=20, c=30;
    void showdata(){
        int a=50,b=60;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
 public class This {
    public static void main(String[] args) {
        new Data1().showdata();
    }
}
