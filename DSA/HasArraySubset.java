package DSA;
import java.util.HashMap;
public class HasArraySubset {
    public static void main(String[] args) {
       int []a={11,7,1,13,21,3,7,3};
       int []b={11,3,7,1,17};
       HashMap<Integer, Integer> aMap=new HashMap();
       for(int ele :a){
        if(aMap.containsKey(ele)){
        int freq=aMap.get(ele);
        aMap.put(ele, 1);
        }
        else aMap.put(ele,1 );
       }
        HashMap<Integer, Integer> bMap=new HashMap();
       for(int ele :b){
        if(!aMap.containsKey(ele)){
             System.out.println(false);
             return;
        }
        if(bMap.containsKey(ele)){
        int freq=bMap.get(ele);
        bMap.put(ele, 1);
        }
        else bMap.put(ele,1 );
       }
       for( int ele: bMap.keySet()){

        int freq=bMap.get(ele);
        int aFreq=aMap.get(ele);
        if(aFreq<freq) {
            System.out.println(false);
            return;
        }
       }
       System.out.println(true);
    }
}
