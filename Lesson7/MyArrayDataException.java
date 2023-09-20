package Lesson7;

public class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {

        super(String.format("Invalid data in %d row, %d column", row, col));
        System.out.println("Value is not correct");
    }
}


