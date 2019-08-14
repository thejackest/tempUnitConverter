import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tempUnitConverterTest {

    @Test
    void getValue() {
        tempUnitConverter unit = new tempUnitConverter(0);
        assertEquals(0,unit.getValue());
    }
    @Test
    void getKelvinValue() {
        Kelvin unit = new Kelvin(30);
        assertEquals(30,unit.getValue());
    }

    @Test
    void convertFromKelvinToCelsius(){
        //given 20 degrees Kelvin
        Kelvin input =  new Kelvin(20);
        //convert it to Celsius
        Celsius actual = new Celsius(input.toCelsius());
        //the result should be -253
        float expected = -253;
        assertEquals(expected,actual.getValue(),"correct");
    }
}