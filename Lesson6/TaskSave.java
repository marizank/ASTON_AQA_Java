package Lesson6;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TaskSave {

        public static void main(String[] args) throws IOException {
            // String[] header = { "Value 1","Value 2","Value 3",};
            int[][] data={

                    {100,200,123},
                    {300,400,500}
            };
            FileWriter writer=null;
            try {
                writer = new FileWriter("test.csv");
            /*for (int i=0; i<= header.length;i++) {
                writer.write(String.valueOf(header[i]));
               writer.write(" ");
            }
             writer.write("\r\n");*/

                for (int i = 0; i < data.length; i++) {
                    for (int j = 0; j < data.length; j++) {
                        writer.write(String.valueOf(data[i][j]));
                        writer.write(" ");
                    }
                    writer.write("\r\n");
                }
                System.out.println("done");
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                writer.close();

            }
        }
}
