package task04;

import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.

public class CreateString {
    public static String createRepeatWord(String word, int repeat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {
        try (FileWriter sWriter = new FileWriter(fileName)) {
            sWriter.write(str);
            System.out.println("Данные записаны");
        } catch (IOException e) {
            System.err.println("ERROR");
        }

    }

    public static void main(String[] args) {
        String word = "TEST";
        int repeat = 100;
        String test = createRepeatWord(word, repeat);

        System.out.println(test);

        String fileName = "file.txt";

        writeToFile(test, fileName);
    }
}
