package task05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. 
//В случае возникновения исключения, оно должно записаться в лог-файл.

public class FolderContent {

    static private Logger logger = Logger.getLogger(FolderContent.class.getName());

    public static String[] getFolderContent() {
        String path = System.getProperty("user.dir");
        File dir = new File(path);
        return dir.list();
    }

    public static void writeArrToFile(String[] dataArr, String fileName) {
        try (FileWriter sWriter = new FileWriter(fileName)) {
            for (String string : dataArr) {
                sWriter.write(string);
                sWriter.append(System.lineSeparator());
            }
            sWriter.flush();
            logger.info("Saved");
        } catch (IOException e) {
            logger.warning(e.getMessage());;
        }
    }

    public static void main(String[] args) throws SecurityException, IOException {
        logger.setLevel(Level.ALL);

        FileHandler fh = new FileHandler("log.txt");
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.addHandler(fh);
        String[] folderContent = getFolderContent();
        String fileName = "data.txt";

        writeArrToFile(folderContent, fileName);
    }
}

