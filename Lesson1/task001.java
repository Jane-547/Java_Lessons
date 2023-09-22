//Задана натуральная степень k. Сформировать случайным
//образом список коэффициентов (значения от 0 до 100)
//многочлена многочлен степени k.

package Lesson1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class task001 {
    public static void main(String[] args) {
        mnogoch();
    }

    public static void mnogoch () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение k: ");
        String k = sc.nextLine();
        int size = generateRandomIntInRange(1, 5);
        String [] arr = new String[size];
        for (int i = 0; i <= size; i++) {
            ArrayList<String> spisok = new ArrayList<String>();
            int a = generateRandomIntInRange(0, 100);
            int b = generateRandomIntInRange(0, 100);
            int c = generateRandomIntInRange(0, 100);
            String first = Integer.toString(a) + "*x^" + k;
            String second = " + " + Integer.toString(b) + "*x";
            String third = " + " + Integer.toString(c);
            String end = " = 0";
            if (a != 0){
                if (a == 1) {
                    first = "x^" + k;
                    spisok.add(first);
                }
                else spisok.add(first);
            }
            if (b != 0){
                if (b == 1) {
                    second = " + x";
                    spisok.add(second);
                }
                else spisok.add(second);
            }
            if (c != 0){
                spisok.add(third);
            }
            spisok.add(end);
            for (String el: spisok) {
                System.out.print(el);
            }
            System.out.println();
        }
    }

    public static int generateRandomIntInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}