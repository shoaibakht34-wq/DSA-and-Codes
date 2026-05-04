package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //stream api uses for collection process and also used for group of objects processes
        Stream<Object> emptyStream=Stream.empty();
       //from array object collection
        String names[]={"shoaib","zayan","ziyaul","Ariz"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(i->{
            System.out.println(i);
        });
        Stream<Object>streamBuilder=Stream.builder().build();
        //list,set using stream
        List<Integer>list2=new ArrayList<>();
        list2.add(67);
        list2.add(54);
        list2.add(82);
        list2.add(79);
        Stream<Integer> stream2=list2.stream();
        stream2.forEach(i->{
            System.out.println(i);
        });
    }
}
