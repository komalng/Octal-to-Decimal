package numberconverter;
import number.GetDigits;
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
}
