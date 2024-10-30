package ru.yagunova.sortmassive.util;

public class Sort {
    public static void sortArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int ind = i;
            int min = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < min) {
                    ind = j;
                    min = ints[j];
                }
            }
            ints[ind] = ints[i];
            ints[i] = min;
        }
    }
}
