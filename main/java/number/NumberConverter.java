package number;

import java.util.List;

public class NumberConverter {
    public static void main(String[] args){
        ParseResult parsing = new ParseResult(args);
        String number = parsing.number;
        int base = parsing.fromBase;
        if(isNotContainingBaseNumber(number,  base)){
            System.out.println("Number is not Valid");
            return;
        }
        List<Integer> numbe = (Multiplication.getMultiplication(GetDigits.getDigits(number), PowerSeries.getPowerSeries(number.length(),base)));
        System.out.println(Sum.getSum(numbe));
    }

    private static boolean isNotContainingBaseNumber(String digits,int baseNumber) {
        for(int digit:GetDigits.getDigits(digits)){
            if(digit > baseNumber){
                return true;
            }
        }
        return false;
    }

}