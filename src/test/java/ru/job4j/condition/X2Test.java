package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}