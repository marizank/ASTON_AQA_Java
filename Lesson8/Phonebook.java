package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
     public HashMap<String, List<String>> phonebook;
     public Phonebook(){
        this.phonebook = new HashMap<>();
    }
    public void add(String surname, String number){
        if(phonebook.containsKey(surname)){
            List<String> numbers = phonebook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("number %s add to %s", number,surname));
            } else {System.out.println(String.format("this number %s have been in this phonebook %s:", number, surname));
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
           System.out.println(String.format(surname+ " - " + number));
        }
    }
    public List<String> get(String surname){
        if(phonebook.containsKey(surname)){
            return phonebook.get(surname);
        } else {
            System.out.println(String.format("This phonebook don't have this info:", surname));
            return new ArrayList<>();
        }
    }
}
