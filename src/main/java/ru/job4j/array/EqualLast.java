package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int i = 0; i < left.length; i++) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return result;
    }
}