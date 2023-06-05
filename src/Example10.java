import java.util.ArrayList;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> filteredNumbers = getFilteredNumbers(numbers, 3);

        System.out.println(filteredNumbers);
    }

    public static List<Integer> getFilteredNumbers(List<Integer> numbers, int max) {
        List<Integer> filteredNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number < max) {
                filteredNumbers.add(number);
            }
        }

        return filteredNumbers;
    }
}
