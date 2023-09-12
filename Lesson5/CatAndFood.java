package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class CatAndFood {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int moreFood;
        Cat2[] arrCat2;
        arrCat2 = new Cat2[3];
        arrCat2[0] = new Cat2("Mur", 13, false);
        arrCat2[1] = new Cat2("Murzik", 15, false);
        arrCat2[2] = new Cat2("Vasia", 18, false);


        Plate plate = new Plate(30);
        plate.info();
        for (int i = 0; i < arrCat2.length; i++) {
            System.out.println("the cat " + arrCat2[i].name + " appetite=" + arrCat2[i].appetite);
            if (arrCat2[i].fullness == false && arrCat2[i].appetite < plate.food) {
                arrCat2[i].eat(plate);
                arrCat2[i].fullness = true;
                System.out.println("The cat " + arrCat2[i].name + " is full");
            } else {
                System.out.println("The cat " + arrCat2[i].name + " isn't full" );
            }
        }
        plate.info();
        System.out.println("You should give more food! " + "Enter the amount of food:");
        moreFood = sc.nextInt();
        plate.moreFood(moreFood);
        plate.info();
    }

}

class Cat2 {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat2(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.lessFood(appetite);
    }
}
class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void lessFood(int less) {
        food -= less;
    }
    public void moreFood(int more) {
        food += more;
    }
    public void info() {
        System.out.println("total food" + food);
    }
}
