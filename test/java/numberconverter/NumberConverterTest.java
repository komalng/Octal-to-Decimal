package numberconverter;
import number.GetDigits;
import number.Multiplication;
import number.PowerSeries;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NumberConverterTest {
    @Test public void reversingSplitnumbers(){
        List<Integer> a = Arrays.asList(3,2,1);
        assertEquals(a, GetDigits.getDigits("123"));
    }
    @Test public void takingPowerOfBasenumberAccordingToNumbersOftimes(){
        List<Integer> powerSeries = Arrays.asList(1,4,16);
        assertEquals( powerSeries,PowerSeries.getPowerSeries(3,4));
    }
    @Test public void multiplicationOfDigitAndPowerSeriesAccordingToIndex(){
        List<Integer> product = Arrays.asList(3,16,64);
        List<Integer> a = Arrays.asList(3,2,1);
        List<Integer> powerSeries = Arrays.asList(1,8,64);
        assertEquals(product, Multiplication.getMultiplication(a,powerSeries));
    }
}
