public class FizzBuzzConverter {

    public String convert(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        return "Buzz";
    }
}
