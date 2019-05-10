import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class OctalToDecimalConverter {
    public static void main(String[] args){
        String Octal = args[0];
        if(isNotOctal(Octal)){
            System.out.println("Number is not Octal");
            return ;
        }
        int userNumber = Integer.parseInt(args[0]);
        int addRemainder = 0;
        int exponent = 0;
        for(int digit:getDigits(args[0])){
            addRemainder = addRemainder + digit*(int)(StrictMath.pow(8,exponent));
            exponent = exponent + 1;

        }
        System.out.println(addRemainder);
    }

    private static List<Integer> getDigits(String Num) {
        int number = Integer.parseInt(Num);
        List<Integer> num = new ArrayList<>();
        while(0 != number){
            int remainder = getRemainder(number);
            number = getQuotient(number);
            num.add(remainder);
        }
        return num;
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

    private static int getQuotient(int userNumber) {
        return userNumber/10;
    }

    private static int getRemainder(int userNumber) {
        return userNumber%10;
    }
}