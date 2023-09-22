//Даны два файла, в каждом из которых находится запись
//многочлена. Сформировать файл содержащий сумму
//многочленов.


package Lesson1;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class task002 {
    public static void main(String[] args) {

        average();
    }
    public static final String PATH = "C://JavaTask";
    public static void average() {
        Scanner sc = new Scanner(System.in);
        File file = new File(PATH);
        File file1 = new File("C://JavaTask", "file01.txt");
        File file2 = new File("C://JavaTask", "file02.txt");
        File file3 = new File("C://JavaTask", "file03.txt");
    }
}