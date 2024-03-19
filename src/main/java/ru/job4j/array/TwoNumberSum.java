package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int j = array.length - 1;
        int i = 0;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else {
                if (j == i + 1) {
                    i++;
                    j = array.length - 1;
                }
                j--;
            }
        }
        return new int[0];
    }
}
