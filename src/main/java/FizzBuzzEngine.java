import utils.NumberToListConverter;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {

    public static List<Object> convert(int number) {
        List<Object> result = new ArrayList<Object>();
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        List<Integer> listOfNumbers = NumberToListConverter.convert(number);
        listOfNumbers.forEach(element -> result.add(fizzBuzzConverter.convert(element)));
        return result;
    }


}
