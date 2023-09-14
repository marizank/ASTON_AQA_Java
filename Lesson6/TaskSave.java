package Lesson6;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TaskSave {

        public static void main(String[] args) throws IOException {
            FileWriter writer=null;
            try {
                writer = new FileWriter("test.csv");
                StringBuilder sb=new StringBuilder();
                sb.append("Value1");
                sb.append(" ");
                sb.append("Value2");
                sb.append(" ");
                sb.append("Value3");
                sb.append("\n");

                sb.append(100);
                sb.append("    ");
                sb.append(200);
                sb.append("    ");
                sb.append(123);
                sb.append("\n");

                sb.append(300);
                sb.append("    ");
                sb.append(400);
                sb.append("    ");
                sb.append(500);
                sb.append("\n");

                writer.write(sb.toString());

                System.out.println("done");
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                writer.close();

            }
        }
}
