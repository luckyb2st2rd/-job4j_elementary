package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[i + 3] != postfix[i]) {
                result = false;
            }
        }
        return result;
    }
}