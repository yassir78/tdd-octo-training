import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzEngineTest {

    @Test
    void shouldThrowExceptionWhenInputIs0() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.convert(0));
    }

    @Test
    void shouldReturnListContaining1WhenInputIs1() {
        assertEquals(List.of("1"), FizzBuzzEngine.convert(1));
    }

    @Test
    void shouldReturnListOf1And2AndFizzWhenInput3() {
        assertEquals(List.of("1", "2", "Fizz"), FizzBuzzEngine.convert(3));
    }
}