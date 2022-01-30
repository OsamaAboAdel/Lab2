package Second_Lab;
import java.util.Random;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/24/2022.
 */
public class Q3_HM {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        removerandomly(array);
    }
static void removerandomly(int[] array) {
    Random r = new Random();
    for (int i = 0; i < array.length; i++) {
        int ind=r.nextInt(array.length);
        array[ind]=0;
        for (int j = 0; j < array.length; j++) {
            ind=r.nextInt(array.length);
            array[ind]=0;
        }
    }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
}
}
