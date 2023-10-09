import java.util.HashSet;
import java.util.Random;

public class Task01 {

    public static int [] fillArray (int [] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = random.nextInt(25);
        }
        return arr;
    }

    public static Double uniq (int [] arr) {
        HashSet <Integer> quantity = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            quantity.add(arr[i]);
        }
        int size = quantity.size();
        System.out.println(quantity);
        System.out.println(size);
        Double res = (double) (size * 10000 / arr.length);
        return res/100;
    }
}
