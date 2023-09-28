package Lesson9;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> AL = new ArrayList<>();
        int number;
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            number = rnd.nextInt() % 100;
            AL.add(number);
        }
        System.out.println(AL);
        int totalEvenNumber = (int)(AL.stream().filter((n)->(n%2)==0)).count();
        System.out.println("Total even number = " + totalEvenNumber);
    }

}
