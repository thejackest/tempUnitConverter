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
    @Test
    void convertFromKelvinToFahrenheit(){
        //given 20 degrees Kelvin
        Kelvin input =  new Kelvin(20);
        //convert it to fahrenheit
        Fahrenheit actual = new Fahrenheit(input.toFahrenheit());
        //the result should be -423.4
        float expected = (float)-423.4;
        assertEquals(expected,actual.getValue(),"correct");
    }

    @Test
    void convertFromCelsiusToKelvin(){
        //given 120 degrees Celsius
        Celsius input =  new Celsius(120);
        //convert it to Kelvin
       Kelvin actual = new Kelvin(input.toKelvin());
        //the result should be 393
        float expected = 393;
        assertEquals(expected,actual.getValue(),"correct");
    }

    @Test
    void convertFromCelsiusToFahrenheit(){
        //given 120 degrees Celsius
        Kelvin input =  new Kelvin(20);
        //convert it to fahrenheit
        Fahrenheit actual = new Fahrenheit(input.toFahrenheit());
        //the result should be -248
        float expected = 248;
        assertEquals(expected,actual.getValue(),"correct");
    }
}