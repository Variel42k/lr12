import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("programming");

        List<String> filteredStrings = getFilteredStrings(strings, "o");

        System.out.println(filteredStrings);
    }

    public static List<String> getFilteredStrings(List<String> strings, String substring) {
        List<String> filteredStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.contains(substring)) {
                filteredStrings.add(string);
            }
        }

        return filteredStrings;
    }
}
