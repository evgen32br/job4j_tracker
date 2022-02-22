package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionDiapasonTest {

    @Test
    public void whenLinearFunctionThenResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenResults() {
        List<Double> result = FunctionDiapason.diapason(2, 5, x -> 2 * (x * x) + 3 * x + 1);
        List<Double> expected = Arrays.asList(15D, 28D, 45D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenResults() {
        List<Double> result = FunctionDiapason.diapason(2, 5, x ->  Math.pow(3, x));
        List<Double> expected = Arrays.asList(9D, 27D, 81D);
        assertThat(result, is(expected));
    }
}