package StremAPI;

import java.util.List;

    public class sumofDigit {
        public static void main(String[] args) {
            List<Integer> list = List.of(123, 456, 789);

            

            // list.stream().map(i->String.valueOf(i).chars().map(Character::getNumericValue).sum()).forEach(System.out::println);

            list.stream().map((i)->String.valueOf(i).chars().map((c)->c-'0').sum()).forEach(System.out::println);
        }
    }