package DSA;
import java.util.HashMap;
public class Hasmp {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("Shoaib", 1);
        map.put("Aditya", 19);
        map.put("Akhtar",12 );
        //System.out.println(map+" "+map.size() );
        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
