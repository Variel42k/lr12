import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> squares = getSquares(numbers);

        System.out.println(squares);
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squares = new ArrayList<>();

        for (int number : numbers) {
            squares.add(number * number);
        }

        return squares;
    }
}
