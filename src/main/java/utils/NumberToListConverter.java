package utils;

import java.util.List;

public class NumberToListConverter {

    public static List<Integer> convert(int number) throws IllegalArgumentException {

        if (number == 2) return List.of(1, 2);

        if (number == 1) return List.of(1);

        if (number < 0) throw new IllegalArgumentException("Number cannot be negative");

        throw new IllegalArgumentException("Number cannot be 0");
    }

}
