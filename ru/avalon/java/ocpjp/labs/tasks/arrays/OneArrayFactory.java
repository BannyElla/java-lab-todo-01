package ru.avalon.java.ocpjp.labs.tasks.arrays;


import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author Ella
 */
public class OneArrayFactory implements Factory<int[]> {
    int arr[];
    private final int LEFT_SCOPE = 10;
    private final int RIGHT_SCOPE = 20;
    private final int MAX = 100;

    @Override
    public int[] create() {
        Random rnd = new Random();
        int digit;
        int arrSize = rnd.nextInt(RIGHT_SCOPE - LEFT_SCOPE) + LEFT_SCOPE;
        arr = new int[arrSize];
        for(int i = 0; i < arrSize; ++i ) {
         digit = rnd.nextInt(MAX);
         arr[i] = digit;
        }
        return arr;
    }
}
