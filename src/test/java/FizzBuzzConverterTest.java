import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {

    @Test
    void shouldReturnFizzWhenInputIs3() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
    }

    @Test
    void shouldReturnFizzWhenInputIs5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
    }


    @Test
    void shouldReturnFizzWhenNumberIsMultipleOf3() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.convert(6));
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIs15() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsMultipleOf15() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }

    @Test
    void shouldReturnNumberWhenInputIsMultipleOf5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzzConverter.convert(10));
    }

    @Test
    void shouldReturnNumberWhenInputIsNormalNumber() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("1", fizzBuzzConverter.convert(1));
    }

}