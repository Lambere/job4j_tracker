package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenFactorialIs3() {
        Factorial factorial = new Factorial();
        int start = 3;
        int expected = 6;
        int result = factorial.calc(start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenException() {
        List<String> emptyList = new ArrayList<String>();
        Factorial factorial = new Factorial();
        int start = -2;
        assertThrows(IllegalArgumentException.class,
                () -> {
            throw new IllegalArgumentException();
                });
    }

}