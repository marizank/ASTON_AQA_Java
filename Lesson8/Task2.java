package Lesson8;

public class Task2 {
    public static void main(String[] args){
       // System.out.println("Phonebook");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Black", "67453467");
        phonebook.add("Whizli", "35535456");
        phonebook.add("Potter", "57688768");
        phonebook.add("Dursel", "436546");
        phonebook.add("Sneg", "36578678");
        phonebook.add("Dursel", "436457567");
        phonebook.add("Sneg", "346457568");
        phonebook.add("Potter", "5768890768");
        phonebook.add("Dursel", "43654356");

        System.out.println("Potter"+phonebook.get("Potter"));
        System.out.println("Black"+phonebook.get("Black"));

        System.out.println("Grandjeeer" + phonebook.get("Grandjeeeer"));
        phonebook.add("Grandjer", "92768794");
        System.out.println("Grandjer"+phonebook.get("Grandjer"));





        }



}
