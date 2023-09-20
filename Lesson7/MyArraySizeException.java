package Lesson7;

public class MyArraySizeException extends MyException {
public MyArraySizeException(String array) {
        super(array);
        System.out.println("The size of the array is not 4 by 4 ");
       }

}
