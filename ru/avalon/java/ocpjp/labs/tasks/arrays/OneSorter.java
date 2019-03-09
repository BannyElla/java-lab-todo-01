package ru.avalon.java.ocpjp.labs.tasks.arrays;

/**
 *
 * @author Ella
 */
public class OneSorter implements Sort<int[]> {

    @Override
    public void run(int[] dataSet) {
        int tmp;
        for (int i = 0; i < dataSet.length; i++) {
            for (int j = i + 1; j < dataSet.length; j++) {
                if (dataSet[j] < dataSet[i]) {
                    tmp = dataSet[i];
                    dataSet[i] = dataSet[j];
                    dataSet[j] = tmp;
                }
            }
        }
    }
}
