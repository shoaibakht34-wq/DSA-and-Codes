package DSA;

import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //filter(predicate)predicate=boolean value functions
        // e->{   return true and flase   }
        //map(functions)it returns value
        /* each element operation performed */
        List<String>name=List.of("Aman","ankit","aakash","Kaushal");
        List<String>ne=name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(ne);
        List<Integer>numbers=List.of(23,4,5,6,7);
        List<Integer>n=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(n);
        //sort
        numbers.stream().sorted().forEach(System.out::println);
        Integer in=numbers.stream().min((x,y)->x.compareTo(y)).get();
       System.out.println("min"+in);
       Integer k=numbers.stream().max((x,y)->x.compareTo(y)).get();
       System.out.println("max"+k);
    }
}
