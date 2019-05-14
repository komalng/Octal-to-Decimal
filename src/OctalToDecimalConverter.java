import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class OctalToDecimalConverter {
    public static void main(String[] args){
        int base = Integer.parseInt(args[1]);
        String number = args[2];
        if(isNotContainingBaseNumber(number, base)){
            System.out.println("Number is not Valid");
            return;
        }
        System.out.println(dotProduct(getDigits(number), getPowerSeries(number.length(),base)));

    }

    private static int dotProduct(List<Integer> a, List<Integer> b){
        int decimalNumber = 0;

        for(int i = 0; i < a.size();i++){
            decimalNumber+=a.get(i) *b.get(i);
        }
        return decimalNumber;
    }


    private static List<Integer> getDigits(String num) {
            List<String> listOfdigits = Arrays.asList(num.split(""));
            Collections.reverse(listOfdigits);
            List<Integer> newL = listOfdigits.stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            return newL;

    }

    private static List<Integer> getPowerSeries(int numberOfTerms, int baseNumber) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int power = 0; power < numberOfTerms; power++) {
            listOfNumbers.add((int) (pow(baseNumber, power)));
        }
        return listOfNumbers;
    }

    private static boolean isNotContainingBaseNumber(String digits,int baseNumber) {
        for(int digit:getDigits(digits)){
            if(digit > baseNumber){
                return true;
            }
        }
        return false;
    }

}