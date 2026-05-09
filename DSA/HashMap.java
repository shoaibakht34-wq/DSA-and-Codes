package DSA;
import java.util.HashSet;
public class HashMap {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);set.add(2);
        set.add(21);set.add(11);
        set.add(45);set.add(21);
        System.out.println(set.size());
        System.out.println(set.contains(11)+" "+set.contains(87));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
    }
}
