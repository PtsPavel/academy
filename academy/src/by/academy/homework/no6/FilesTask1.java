package by.academy.homework.no6;


//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
// если введена "stop" строка тогда закончить запись в файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesTask1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        File file = new File("newFile.txt");
        file.createNewFile();
        String text = "";
        try (FileWriter writer = new FileWriter(file)) {
            boolean repeat = true;
            do {
                System.out.println("Please, input new string");
                text = sc.next();
                if (!"stop".equals(text)) {
                    writer.write(text);
                    writer.append("\n");
                } else {
                    repeat = false;
                    System.out.println("All input data save successfully, please check your file");
                }
            } while (repeat);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}
