package utils;

import java.util.List;
import java.util.stream.IntStream;

public class NumberToListConverter {

    public static List<Integer> convert(int number) throws IllegalArgumentException {
        List<Integer> result = new java.util.ArrayList<>();

        if (number < 0) throw new IllegalArgumentException("Number cannot be negative");
        if (number == 0) throw new IllegalArgumentException("Number cannot be 0");

        IntStream.range(1, number + 1).forEach(result::add);

        return result;


    }

}
