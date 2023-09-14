package Lesson6;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TaskRead {

        public static void main(String[] args) throws IOException {
            FileReader reader = null;
            try {
                reader = new FileReader("test.csv");
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                System.out.println("");
                System.out.println("done");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}
