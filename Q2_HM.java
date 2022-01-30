package Second_Lab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class Q2_HM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] nary=new int[arr.length];
        String x ;
        boolean t = true;
        while (t) {int z=0;
            System.out.println("""
                    \s
                      Press 1 to Enter Array of 5 Elements.\s
                            2 to set this array as BackUp array.\s
                            3 to see your previous BackUp array.""");
            x=in.next();
            for (int i = 0; i < x.length(); i++)
                if (isDigit(x.charAt(i))&&isDigit(x.charAt(0))) z = Integer.parseInt(x);
            switch (z) {
                case 1:
                    for (int i = 0; i <= arr.length - 1; i++) arr[i] = in.nextInt();
                break;
                case 2:
                    nary=backup(arr);
                break;
                case 3:
                    System.out.println(Arrays.toString(backup(nary)));
                    break;
                default:
                    System.out.println("Wrong choice try again");
                    t=false;
                    break;
            }
        }
    }
        public static int[] backup ( int[] arr){
            int[] BackUp_Array = new int[arr.length];
            System.arraycopy(arr, 0, BackUp_Array, 0, arr.length - 1 +1);
            return BackUp_Array;
        }
}
