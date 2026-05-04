package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMAin1 {
    public static void main(String[] args) {
        List<Integer>list1=List.of(2,4,50,21,22,67);
        List<Integer>list2=new ArrayList<>();
        list2.add(67);
        list2.add(54);
        list2.add(82);
        list2.add(79);
        List<Integer> list3=Arrays.asList(23,567,12,677,24);
        //without stream
        List<Integer>listEven=new ArrayList<>();
       for(Integer i:list1){
        if(i%2==0){
            listEven.add(i);
        }
       }
       System.out.println(list1);
       System.out.println(listEven);
       //using Stream Api
       Stream<Integer> stream=list1.stream();
       List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
       System.out.println(newList);
       List<Integer>newL=list1.stream().filter(i->i>10).collect(Collectors.toList());
       System.out.println(newL);
    }
}
