public class Lesson_2 {
    public static void main(String[] args) {

    ThreeWords word = new ThreeWords();
    word.word1 = "orange";
    word.word2 = "banana";
    word.word3 = "apple";
    word.printThreeWords();

    checkSumSign sum = new checkSumSign(45, -54);

    printColor value = new printColor(45);

    compareNumbers we= new compareNumbers(6, 5);
}

    public static class ThreeWords {
        String word1;
        String word2;
        String word3;

        void printThreeWords() {

            System.out.println(word1);
            System.out.println(word2);
            System.out.println(word3);
        }

    }

    public static class checkSumSign {
        checkSumSign(int a, int b) {
            int sum = a + b;
            if (sum >= 0)
                System.out.println("Сумма положительная");
            else
                System.out.println("Сумма отрицательная");
        }
    }

    public static class  printColor {
        printColor(int value) {
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    public static class compareNumbers {
        compareNumbers(int a, int b) {
            if (a >= b) {
                System.out.println("a>=b");
            } else {
                System.out.println("a<b");
            }
        }
    }
}

