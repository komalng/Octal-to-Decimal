package number;

import java.util.ArrayList;
import java.util.List;

public class Multiplication {
    public static List<Integer> getMultiplication(List<Integer> a, List<Integer> b){
        List<Integer> listOfMultiplyNumbers = new ArrayList<>();
        for(int i = 0;i < a.size();i++){
            listOfMultiplyNumbers.add(a.get(i)*b.get(i));
        }
        return listOfMultiplyNumbers;
    }
}
