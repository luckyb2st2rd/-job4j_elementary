package ru.job4j.condition;

public class ChessBoard {

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2)) {
            if (!(x1 == x2) && !(y1 == y2)) {
                result = Math.abs(y1 - y2);
                result = result == Math.abs(x1 - x2) ? Math.abs(x1 - x2) : 0;
            }
        }
        return result;
    }
}
