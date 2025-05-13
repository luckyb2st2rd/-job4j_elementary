package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /*public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double sum = first + second;
        double result = Math.sqrt(sum);
        return result;
    }*/

    public static void main(String[] args) {
       Point a = new Point(0, 0);
       Point b = new Point(2, 0);
       System.out.println(a.distance(b));
    }
}
