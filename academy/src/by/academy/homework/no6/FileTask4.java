package by.academy.homework.no6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileTask4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File dir = new File("fileTask4");
        if (!dir.exists()) {
            dir.mkdir();
        }

        int diff = 576;
        Random rand = new Random();
        for (int i = 1; i < 101; i++) {
            int symbols = (int) rand.nextInt(diff + 1);
            File file = new File(dir, i + ".txt");
            try (FileReader reader = new FileReader("task2File.txt")) {
                int c;
                while ((c = reader.read()) != -1) {
                    sb.append((char) c);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try (FileWriter writer = new FileWriter(file)) {
                file.createNewFile();
                writer.write(sb.substring(0, symbols));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        File file = new File("result2.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (File f : dir.listFiles()) {
                writer.append(f.getName() + " " + f.length() + "\n");
            }
            System.out.println("Your files are created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

