package Lesson9;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        Stream collectionS = collection.stream();
        System.out.println(collection.stream().sorted().collect(Collectors.toList()));
       collection.stream().sorted().collect(Collectors.toList());




    }
}



