import java.io.DataInput;
import java.util.Arrays;
import java.util.Objects;

public class Lesson3 {
    public static void main(String[] args) {

        //вызов метода задание 1
        if (summa(76, 8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(); //для разделения заданий

        //вызов метода задание 2
        if (number(45)) {
            System.out.println("chislo polojitelno");
        } else {
            System.out.println("chislo otritcatelno");
        }
        System.out.println(); //для разделения заданий

        //вызов метода задание 3
        if (check(-45)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(); //для разделения заданий

        //вызов метода задание 4
        printStr("I'm learning Java", 2);
        System.out.println(); //для разделения заданий

        //вызов метода задание 5
        if (leap_Year(1989)) {
            System.out.println( "This is a leap year");
        } else {
            System.out.println( "This isn't a leap year");
        }
        System.out.println(); //для разделения заданий

        //задание 6
        int[] array1={1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(array1));
        for (int i =0; i< array1.length; i++)
            if (array1[i]==0)
                array1[i]=1;
            else {
            array1[i]=0;
            }
            System.out.println(Arrays.toString(array1));
            System.out.println(); //для разделения заданий

        //задание 7
        int[]array2;
        array2=new int[100];
        for (int i=0; i< array2.length; i++){
            array2[i]=i+1;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(); //для разделения заданий

        //задание 8
        int[] array3={1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(array3));
        for (int i =0; i< array1.length; i++)
            if (array3[i]<6)
                array3[i]=array3[i]*2;

        System.out.println(Arrays.toString(array3));
        System.out.println(); //для разделения заданий

        //задание 9
        int [][] array4 = {
                {7,3,9,1},
                {1,9,2,7},
                {9,5,0,2},
                {8,3,3,9}
        };
        for(int i=0; i<array4.length; i++){
            array4[i][array4.length - i - 1] = 1;
        }
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][i] = 1;
            }
        }
        for (int[] array5 : array4) {
            System.out.println(Arrays.toString(array5));
        }
        System.out.println(); //для разделения заданий
        //task_10 вызов метода
        lastTask(6,7);
    }

    //задание_10
    public static void lastTask(int len, int initialValue){
        int[] array6 = new int[len];
        for (int i = 0; i < len; i++) {
            array6[i] = initialValue;
        }
        System.out.println(Arrays.toString(array6));
    }

    //задание_1
    public static boolean summa(int a, int b) {
        int sum = a + b;
        // return sum >= 10 && sum <= 20;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //задание_2
    public static boolean number(int value) {
        //return value >= 0;
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //задание_3
    public static boolean check (int chislo) {
        return chislo <= 0;
    }

    //задание_4
    public static void printStr(String text, int count)
    {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }

    //задание_5
    public static boolean leap_Year(int y) {
        boolean x=(y>1584);
        boolean a=(y%4)==0;
        boolean b=(y%100)!=0;
        boolean c=((y%100==0)&&(y%400==0));
        return x&&a&&(b||c);
    }
}

