package StremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,1,1,1,2,2,2,2,3,4,5,6,7,8,9,10);


        System.out.println("Even numbers");
        list.stream().filter(i->i%2==0).forEach(System.out::println);
        System.out.println("Square of numbers");
        list.stream().map(i->i*i).forEach(System.out::println);
        System.out.println("Sorted numbers");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Limit of numbers");
  
    }
}
