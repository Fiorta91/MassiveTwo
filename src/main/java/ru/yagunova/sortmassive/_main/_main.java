package ru.yagunova.sortmassive._main;

import ru.yagunova.sortmassive.entity.ArrayGenerator;

import java.util.Arrays;

import static ru.yagunova.sortmassive.util.Sort.sortArray;

public class _main {
    public static void main(String[] args) {
        int[] random = ArrayGenerator.random();
        System.out.println(Arrays.toString(random));
        sortArray(random);
        System.out.println(Arrays.toString(random));
    }
}
