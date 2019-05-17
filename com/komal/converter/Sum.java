package com.komal.converter;

import java.util.List;

public class Sum {
    public static int getSum(List<Integer> numbers){
        int result = 0;
        for(int i = 0; i < numbers.size();i++){
            result = result + numbers.get(i);
        }
        return result;
    }
}
