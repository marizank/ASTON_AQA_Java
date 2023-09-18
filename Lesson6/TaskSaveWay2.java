package Lesson6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskSaveWay2 {
        public static void main(String[] args) throws IOException {
            FileWriter writer = null;
            String input = "[\"Value1\",\"Value2\",\"Value3\", \"100\",\"200\",\"123\", \"300\",\"400\",\"500\"]";
            input = input.substring(1, input.length() - 1); // get rid of brackets
            String[] split = input.split(" ");
            writer = new FileWriter("test2.csv");
            for (String s : split) {
                String[] split2 = s.split(",");
                writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(";")));
                writer.write("\n"); // newline
            }
            writer.close();

        }

}
