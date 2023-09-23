//Даны два файла, в каждом из которых находится запись
//многочлена. Сформировать файл содержащий сумму
//многочленов.


package Lesson1;

import java.util.Scanner;
import java.io.*;

public class task002 {
    public static void main(String[] args) {

        average();
    }

    public static void average() {
        int a = 0;
        int b = 0;

        try {
            Scanner sc = new Scanner(new File("C:\\Всякое мое\\Учеба Гик\\5. Java\\Repo\\Lesson1\\file1.txt"));
            while (sc.hasNextLine()) {
                a = Integer.parseInt(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(new File("C:\\Всякое мое\\Учеба Гик\\5. Java\\Repo\\Lesson1\\file2.txt"));
            while (sc.hasNextLine()) {
                b = Integer.parseInt(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            File file3 = new File("C:\\Всякое мое\\Учеба Гик\\5. Java\\Repo\\Lesson1\\file3.txt");

            if (file3.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            try (FileWriter fw = new FileWriter(file3)) {
                String c = Integer.toString(a + b);
                fw.write(c);
                System.out.println("Successfully written data to the file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}