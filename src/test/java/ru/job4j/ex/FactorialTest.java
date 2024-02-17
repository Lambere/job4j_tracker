package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenException() {
        Factorial factorial = new Factorial();
        int start = 3;
        int expected = 6;
        int result = factorial.calc(start);
        assertThat(result).isEqualTo(expected);
    }
}