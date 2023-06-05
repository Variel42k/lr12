import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("programming");

        List<String> filteredStrings = getFilteredStrings(strings, 4);

        System.out.println(filteredStrings);
    }

    public static List<String> getFilteredStrings(List<String> strings, int length) {
        List<String> filteredStrings = new ArrayList<>();

        for (String string : strings) {
            if (string.length() > length) {
                filteredStrings.add(string);
            }
        }

        return filteredStrings;
    }
}
