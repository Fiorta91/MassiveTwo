package ru.yagunova.sortmassive.entity;

import java.util.Random;

public class ArrayGenerator {
    public static int[] random() {
        int[] arrRandom = new int[4];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = new Random().nextInt(-100, 100);
        }
        return arrRandom;
    }
}
