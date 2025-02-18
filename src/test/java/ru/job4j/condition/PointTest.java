package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
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
    }
}