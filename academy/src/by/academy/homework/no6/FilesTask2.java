package by.academy.homework.no6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesTask2 {
    public static void main(String[] args) throws IOException {
        File file = new File("task2File.txt");
        Scanner sc = new Scanner(file);

        String fileContent = "";
        while(sc.hasNextLine()) {
            fileContent = fileContent.concat(sc.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("result.txt");
        writer.write(fileContent.replaceAll("( )+", ""));
        writer.close();
    }
}
