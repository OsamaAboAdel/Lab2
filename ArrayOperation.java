package Second_Lab;

import java.util.Arrays;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class ArrayOperation {
        public static void main(String[] args) {
            int array []={11,12,13,14,15};
                System.out.println(Arrays.toString(array));
//                System.out.println(Arrays.toString(revers(array)));
//                System.out.println("Shift Left");
//                System.out.println(Arrays.toString(ShiftLeft(array)));
                System.out.println("Shift Right");
                System.out.println(Arrays.toString(shiftRight(array)));
        }
    public  static int[] shiftRight(int[] arr)
    {
        int t=arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=t;
        return arr;
    }

        public static int[] ShiftLeft(int [] arr){
            int t=arr[0];
            for (int i = 0; i <arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=t;
            return arr;
        }

        public static int[] revers(int [] arr){
            int n=arr.length-1;
            int t;
            for (int i = 0; i < arr.length/2; i++) {
                t=arr[i];
                arr[i]=arr[n];
                arr[n]=t;
                n--;
            }
            return arr;
        }
    }

