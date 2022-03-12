import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {

    @Test
    void shouldReturnFizzWhenInputIs3() {
        testGenerator(3, "Fizz");
    }

    @Test
    void shouldReturnFizzWhenInputIs5() {
        testGenerator(5, "Fizz");

    }


    @Test
    void shouldReturnFizzWhenNumberIsMultipleOf3() {
        testGenerator(6, "Fizz");
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIs15() {
        testGenerator(15, "FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsMultipleOf15() {
        testGenerator(30, "FizzBuzz");
    }

    @Test
    void shouldReturnNumberWhenInputIsMultipleOf5() {
        testGenerator(5, "Buzz");
    }

    @Test
    void shouldReturnNumberWhenInputIsNormalNumber() {
        testGenerator(1, "1");
    }


    private void testGenerator(int input, String expected) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals(expected, fizzBuzzConverter.convert(input));
    }


}