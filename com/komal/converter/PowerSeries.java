package com.komal.converter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class PowerSeries {
    public static List<Integer> getPowerSeries(int numberOfTerms, int baseNumber) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int power = 0; power < numberOfTerms; power++) {
            listOfNumbers.add((int) (pow(baseNumber, power)));
        }
        return listOfNumbers;
    }


}
