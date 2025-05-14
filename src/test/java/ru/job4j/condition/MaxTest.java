package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int expected = 4;
        int out = Max.max(a, b, c, d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int a = 2;
        int b = -3;
        int c = -4;
        int d = 1;
        int expected = 2;
        int out = Max.max(a, b, c, d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int a = 4;
        int b = 5;
        int c = 0;
        int d = 1;
        int expected = 5;
        int out = Max.max(a, b, c, d);
        assertThat(out).isEqualTo(expected);
    }

    /*@Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }*/
}