import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class OctalToDecimalConverter {
    public static void main(String[] args){
        String base = args[1];
        String Octal = args[2];
        if(isNotOctal(Octal)){
            System.out.println("Number is not Octal");
            return;
        }
        System.out.println(getDecimal(getDigits(args[2]),getPowerEight(args[2].length())));

    }

    private static int getDecimal(List<Integer> listOfDigits, List<Integer> listOfPowerEight){
        int decimalNumber = 0;

        for(int i = 0; i < listOfDigits.size();i++){
            decimalNumber+=listOfDigits.get(i) *listOfPowerEight.get(i);
        }
        return decimalNumber;
    }


    private static List<Integer> getDigits(String Num) {
        List<String> listOfdigit = new ArrayList<>();
        if(Num.substring(0,1).equals("-")){
            listOfdigit.add(Num);
            List<Integer> newList = listOfdigit.stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            return newList;

        }
        else {
            List<String> listOfdigits = Arrays.asList(Num.split(""));
            Collections.reverse(listOfdigits);
            List<Integer> newL = listOfdigits.stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
            return newL;
        }


    }

    private static List<Integer> getPowerEight(int lengthOfArgs) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int base_number  = 8;
        for (int power = 0; power < lengthOfArgs; power++) {
            listOfNumbers.add((int) (pow(base_number, power)));
        }
        return listOfNumbers;
    }

    private static boolean isNotOctal(String octal) {
        return octal.contains("8")|| octal.contains("9");
    }


}