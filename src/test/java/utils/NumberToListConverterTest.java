package utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberToListConverterTest {

    @Test
    void shouldThrowExceptionWhenInputIs0() {
        Executable executable = () -> NumberToListConverter.convert(0);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                executable);
        assertEquals("Number cannot be 0", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenInputIsNegative() {
        Executable executable = () -> NumberToListConverter.convert(-1);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                executable);
        assertEquals("Number cannot be negative", exception.getMessage());
    }

    


}