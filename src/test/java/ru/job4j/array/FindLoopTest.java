package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot11ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int element = 11;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int expected = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThenMinus1() {
        int[] data = {-2, 10, 3, 5, 11, 54, 23, 100, -12, 4};
        int el = 8;
        int start = 2;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}