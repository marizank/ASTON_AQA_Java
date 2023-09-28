package Lesson9;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        System.out.println("The sorted stream is : ");
               list.stream().sorted().
                forEach(System.out::println);
    }
}


