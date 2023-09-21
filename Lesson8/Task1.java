package Lesson8;

import java.util.*;

public class Task1 {
    public static void main(String[] args){
        String[] wordsMassive={"Cat","Dog","Cat","Cat","Fish","Cow","Hamster","Cat","Turtle","Dog","Sheep","Sheep","Cat","Bird","Mouse","Duck","Cat","Duck","Dog","Cat"};
        ArrayList<String> wordsList=new ArrayList<>(Arrays.asList(wordsMassive));
        /*
        //Another way to create arraylist without used massive:
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Dog");
        words.add("Cat");
        words.add("Cat");
        words.add("Fish");
        words.add("Cow");
        words.add("Hamster");
        words.add("Cat");
        words.add("Turtle");
        words.add("Dog");
        words.add("Sheep");
        words.add("Sheep");
        words.add("Cat");
        words.add("Bird");
        words.add("Mouse");
        words.add("Duck");
        words.add("Cat");
        words.add("Duck");
        words.add("Dog");*/
        System.out.println(wordsList);
        Set<String> unique = new HashSet<String>(wordsList);
        System.out.println("Unique words:" + unique.toString());
        for (String key : unique) {
            System.out.println( key + " occurs"  + ": " + Collections.frequency(wordsList, key));
        }
    }
}
