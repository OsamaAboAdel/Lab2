package Second_Lab;

import java.util.Arrays;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class Q1_HM {
    public static void main(String[] args) {
        int[] arr1= new int[]{1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ReverseArray(arr1)));
    }
    public static int [] ReverseArray(int [] arr1){
        int[] arr2=new int[arr1.length];
        int i,j=arr1.length-1;
        for (i = 0; arr1.length - 1 >= i;i++) if (j >= 0)arr2[j--] = arr1[i];
        return arr2;
    }
}
