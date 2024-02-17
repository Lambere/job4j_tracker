package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenException() {
        int start = 3;
        int expected = 6;
        int result = Factorial.calc(start);
        assertThat(result).isEqualTo(expected);
    }
}