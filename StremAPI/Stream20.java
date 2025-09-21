package StremAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream20 {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Find the maximum and minimum number from a list using streams.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int max=list.stream().max(Integer::compare).get();

        int min=list.stream().min(Integer::min).get();


        // second max number
        int max1=list.stream().distinct().skip(1).max(Integer::compare).get();
        int min1=list.stream().distinct().skip(1).min(Integer::min).get();
        System.out.println(max1);
        System.out.println(min1);

 

        System.out.println(max1);
        // System.out.println(min);
        
        
        
    }
}
