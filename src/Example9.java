import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello, World!");
        strings.add("12345");
        strings.add("This string contains only letters");

        List<String> filteredStrings = getFilteredStrings(strings);

        System.out.println(filteredStrings);
    }

    public static List<String> getFilteredStrings(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.matches("[a-zA-Z]+")) {
                filteredStrings.add(string);
            }
        }

        return filteredStrings;
    }
}
