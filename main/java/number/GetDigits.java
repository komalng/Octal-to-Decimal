package number;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GetDigits {
    public static List<Integer> getDigits(String num) {
        List<String> listOfdigits = Arrays.asList(num.split(""));
        Collections.reverse(listOfdigits);
        List<Integer> newL = listOfdigits.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        return newL;

    }
}
