package Second_Lab;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${*  Osama Abo Adel  *} on 1/19/2022.
 */
public class ArrayOperation2 {
    int[]x;
    int numOfElements;

    public ArrayOperation2() {
        x = new int[5];
        numOfElements=0;
    }
    public int add(int e)
    {
        if (numOfElements < x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayOperation2 test= new ArrayOperation2();
        Scanner in= new Scanner(System.in);
        System.out.println("Input Elements");
        for (int i = 0; i < 5 ; i++) {
            if (test.add(in.nextInt())==0)
                System.out.println("Added Successfully");
            else
                System.out.println("Array Is Full");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
