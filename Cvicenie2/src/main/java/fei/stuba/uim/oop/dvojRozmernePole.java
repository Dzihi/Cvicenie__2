package fei.stuba.uim.oop;

import java.util.Arrays;
import java.util.Scanner;

public class dvojRozmernePole {
    public static void main(String[] args) {
        int dvojRozmernePole[][] = new int[][]{
                {1, 2, 3},
                {1, 2, 3}};
        int jednoRozmernePole[] = new int[]{2, 3, 5};

        System.out.println("Pole :" + Arrays.toString(jednoRozmernePole));

        for (int[] temp : dvojRozmernePole)
            System.out.println(Arrays.toString(temp));
    }
}
