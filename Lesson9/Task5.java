package Lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void task5Stream() {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> logins = new ArrayList<String>();
        System.out.println("Enter a login: ");
        while (true) {
            System.out.print("login: ");
            s = scanner.nextLine();
            if (s.equals("") == true)
                break;
            logins.add(s);
        }
        System.out.println();
        System.out.println(logins);
        logins.stream()
                .filter(p -> p.startsWith("f"))
                .sorted()
                .forEach(f -> System.out.println(f));
    }
    public static void main (String[]args){
        task5Stream();
            }
}

