package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> collect = new ArrayList<String>();
        Collections.addAll(collect, "Highload", "High", "Load", "Highload");
        System.out.println(collect.stream().filter("High"::equals).count());
        System.out.println(collect.stream().findFirst().orElse("0"));
        System.out.println(collect.stream().skip(collect.size() - 1).findFirst().orElse("0"));
    }
}
