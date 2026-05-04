package DSA;
import java.util.ArrayList;
import java.util.List;
public class ArrayListoop<T> {
private int[]data;
private static int DEFAULT_SIZE=10;
private int size=0;
public ArrayListoop(){
       this.data=new int[DEFAULT_SIZE];
}
public void add(int num){
    if(isFull()){
        resize();
    }
    data[size++]=num;
}
private boolean isFull(){
    return size==data.length;
}
private void resize(){
    int []temp=new int[data.length*2];

}
public int remove(){
    int removed=data[--size];
    return removed;
}
    public static void main(String1[] args) {
        ArrayList<Integer>arr=new ArrayList(); 
        arr.add(45);
        arr.add(78);
        arr.remove(0);
        arr.add(87);
        arr.get(0);
        arr.set(1,98 );
        arr.size();
        System.out.println(arr);
        arr.isEmpty();//returns true if arraylist contains no elements.
        System.out.println(arr);
    }
}
