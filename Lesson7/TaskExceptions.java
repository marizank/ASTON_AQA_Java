package Lesson7;


public class TaskExceptions {
    public static void main(String[] args) throws MyException{
        TaskExceptions check = new TaskExceptions();

        String[][] correct = {
                {"1", "7", "6", "3"},
                {"6", "7", "7", "2"},
                {"1", "1", "6", "1"},
                {"5", "1", "6", "5"}
        };

        String[][] incorrect = {
                {"3", "4", "6"},
                {"7", "7", "7"},
                {"2", "1", "S"}

        };
        try {
            check.massive(correct);
            check.massive(incorrect);

        }catch(MyArraySizeException e) {
            System.out.println("wrong with size massive" +e);
        }

        try {
            System.out.println("summa all elements correct massive ="+check.sum(correct));
            System.out.println("wrong with element massive"+check.sum(incorrect));

        } catch(MyArrayDataException ex) {
            System.out.println("wrong with element massive" + ex);

        }

    }
    public void massive (String[][] arr) throws MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4 && arr[j].length != 4 ) throw new MyArraySizeException(String.format("Massive incorrect"));
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int sum(String[][] arr2) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr2[i][j]);
                } catch (MyArrayDataException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }return sum;
    }
}
