package Lesson1;

import java.util.Scanner;
public class start {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер задачи (1 или 2) или 10 для выхода: ");
            int task = sc.nextInt();
            switch (task) {

                case 1:
                    task001.mnogoch();
                    break;

                case 2:
                    task002.average();
                    break;

                case 10:
                    return;

                default:
                    System.out.println("Вы ввели неверное значение.");
                    sc.close();
                    break;
            }
        }
    }
}
