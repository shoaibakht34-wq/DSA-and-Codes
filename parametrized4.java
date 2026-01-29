// wap to print table of any number using default call by value and call by refremce constructor.
class Table{
    int i,n;
    Table(){
        n=5;
    }
    Table(int x){
        n=x;
    }
    Table(Table t){
        n=t.n;
    }
    void printtable(){
        for(i=1;i<=10;i++){
        System.out.println(i*n);
    }}
}
public class parametrized4 {
    public static void main(String[] args) {
        Table b= new Table();
        Table b1=new Table(7);
        Table b2=new Table(b1);
        b.printtable();
        b1.printtable();
        b2.printtable();
    }
}
