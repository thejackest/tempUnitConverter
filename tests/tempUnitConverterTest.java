import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tempUnitConverterTest {

    @Test
    void getValueTest() {
        tempUnitConverter unit = new tempUnitConverter(0);
        assertEquals(0,unit.getValue());
    }
    @Test
    void getKelvinValueTest() {
        Kelvin unit = new Kelvin(30);
        assertEquals(30,unit.getValue());
    }

    @Test
    void convertFromKelvinToCelsiusTest(){
        //given 20 degrees Kelvin
        Kelvin input =  new Kelvin(20);
        //convert it to Celsius
        Celsius actual = new Celsius(input.toCelsius());
        //the result should be -253
        float expected = -253;
        assertEquals(expected,actual.getValue(),"correct");
    }
    @Test
    void convertFromKelvinToFahrenheitTest(){
        //given 20 degrees Kelvin
        Kelvin input =  new Kelvin(20);
        //convert it to fahrenheit
        Fahrenheit actual = new Fahrenheit(input.toFahrenheit());
        //the result should be -423.4
        float expected = (float)-423.4;
        assertEquals(expected,actual.getValue(),"correct");
    }

    @Test
    void convertFromCelsiusToKelvinTest(){
        //given 120 degrees Celsius
        Celsius input =  new Celsius(120);
        //convert it to Kelvin
       Kelvin actual = new Kelvin(input.toKelvin());
        //the result should be 393
        float expected = 393;
        assertEquals(expected,actual.getValue(),"correct");
    }

    @Test
    void convertFromCelsiusToFahrenheitTest(){
        //given 120 degrees Celsius
        Celsius input =  new Celsius(120);
        //convert it to fahrenheit
        Fahrenheit actual = new Fahrenheit(input.toFahrenheit());
        //the result should be 248
        float expected = 248;
        assertEquals(expected,actual.getValue(),"correct");
    }

    @Test
    void convertFromFahrenheitToKelvinTest(){
        //given 59 degrees fahrenheit
        Fahrenheit input =  new Fahrenheit(59);
        //convert it to Kelvin
        Kelvin actual = new Kelvin(input.toKelvin());
        //the result should be 288
        float expected = 288;
        assertEquals(expected,actual.getValue(),"correct");
    }
    @Test
    void convertFromFahrenheitToCelsiusTest(){
        //given 50 degrees fahrenheit
        Fahrenheit input =  new Fahrenheit(50);
        //convert it to Celsius
        Celsius actual = new Celsius(input.toCelsius());
        //the result should be 10
        float expected = 10;
        assertEquals(expected,actual.getValue(),"correct");
    }
}