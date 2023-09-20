//package Lesson1;
//
///**
// * program
// */
//public class program {
//    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//    }
//
//}
//
//-----
//
//import java.util.Scanner;
//
//public class File {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in, "cp866");
//        System.out.print("Введите имя: ");
//        String name = sc.next();
//
//        // .nextLine()   --- Считывает строчку
//        // .next() --- считывает элемент
//        // .nextInt() --- считывает Число
//
//        //12 \n
//        // num = 12
//        // .... sc.nextLine(); //
//        System.out.printf("Привет, %s", name);
//        sc.close();
//
//    }
//}
//
//
//package Lesson_1;
//
///**
// * Дан массив двоичных чисел, например [1,1,0,1,1,1],
// * вывести максимальное количество подряд идущих 1.
// */
//public class sample_4 {
//
//    public static void main(String[] args) {
//        int[] array = { 1, 1, 0, 1, 1, 1 };
//        int count = 0;
//        int current = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                current += 1;
//            } else {
//                if (current > count) {
//                    count = current;
//                }
//                current = 0;
//            }
//        }
//        if (current > count) {
//            count = current;
//        }
//        System.out.println(count);
//
//    }
//}
//
//
//import java.util.Arrays;
//
//// Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3.
//    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//    // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//    //  а остальные - равны ему.
//
//    // [2 4 1 5 3 3 3 3 3]
//
//    // Работать разрешается только с 1 массивом.
//
//public class File {
//    public static void main(String[] args) {
//        int[] array = { 3,2,4,3,3,1,5,3,3 };
//        int value = 3;
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3){
//                counter += 1;
//            }
//        }
//        for (int i = 0; i < array.length - counter; i++) {
//            if (array[i] == value) {
//                for (int j = i; j < array.length - 1; j++) {
//                    array[j] = array[j+1];
//                }
//                array[array.length -1] = value;
//                i--;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
//
//-- кусочек
//for (int i = 1; i < nums.length; i++) {
//    for (int j = i; j < nums.length; j++) {
//        if (nums[j-1] == 3) {
//             swp = nums[j-1];
//            nums[j-1] = nums[j];
//            nums[j] = swp;
//
//        }
//    }
//
//
//System.out.println(Arrays.toString(nums));
//
//}
//
//
//import java.util.Arrays;
//
//public class TaskTwo
//{public static void main(String[] args) {
//        int[] array = new int[] {3,2,4,3,3,1,5,3,3};
//        int val = 3;
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != val) {
//                array[counter] = array[i];
//                array[i] = val;
//                counter += 1;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}
//
//
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int [] arr = new int[]{1,2,4,5,3,3}; // 1 2 4 5 3 3 3 3 3
//        int val = 3;
//        int count = 0;//4
//
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] != val) {
//                arr[count++] = arr[i];
//            }
//
//        while (count < arr.length)
//            arr[count++] = val;
//
//        // for (int i : arr) {
//        //     System.out.println(i);
//        // }
//        System.out.println(Arrays.toString(arr));
//    }
//}