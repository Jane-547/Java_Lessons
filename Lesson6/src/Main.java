import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int [1000];
        Task01 methods = new Task01();
        methods.fillArray (arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(methods.uniq(arr));

    }
}