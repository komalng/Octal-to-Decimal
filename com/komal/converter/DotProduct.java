package com.komal.converter;

import java.util.List;

public class DotProduct {
    public static int dotProduct(List<Integer> a, List<Integer> b){
        int decimalNumber = 0;

        for(int i = 0; i < a.size();i++){
            decimalNumber+=a.get(i) *b.get(i);
        }
        return decimalNumber;
    }
}
