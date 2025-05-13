package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when11ToMinus20Then3Dot1622776601683795() {
        int x1 = 1;
        int y1 = 1;
        int x2 = -2;
        int y2 = 0;
        Point a = new Point(1, 1);
        Point b = new Point(-2, 0);
        double expected = 3.1622776601683795;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinus24To21Then5() {
        int x1 = -2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 1;
        Point a = new Point(-2, 4);
        Point b = new Point(2, 1);
        double expected = 5;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when72To34Then4Dot47213595499958() {
        int x1 = 7;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        Point a = new Point(7, 2);
        Point b = new Point(3, 4);
        double expected = 4.47213595499958;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }
    /*@Test
    void when11ToMinus20Then3Dot16() {
        int x1 = 1;
        int y1 = 1;
        int x2 = -2;
        int y2 = 0;
        double expected = 3.16;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus24To21Then5() {
        int x1 = -2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 1;
        double expected = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when72To34Then4Dot47() {
        int x1 = 7;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double expected = 4.47;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }*/
}