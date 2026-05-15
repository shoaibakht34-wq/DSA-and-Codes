package prep;

import java.util.ArrayList;
import java.util.List;

public class PartitionLables {
    public static void main(String []args){
        String s="ababcbacadefeghijklij";
        int last[]=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        List<Integer>result=new ArrayList<>();
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end, last[s.charAt(i)-'a']);
            if(i==end){
                result.add(end-start+1);
                start=i+1;
            }
        }
        System.out.println(result);
    }
}
