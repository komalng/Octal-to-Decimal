import com.komal.converter. *;

public class NumberConverter {
    public static void main(String[] args){

        int base = Integer.parseInt(args[1]);
        String number = args[2];
        if(isNotContainingBaseNumber(number, base)){
            System.out.println("Number is not Valid");
            return;
        }
        System.out.println(DotProduct.dotProduct(GetDigits.getDigits(number), PowerSeries.getPowerSeries(number.length(),base)));

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