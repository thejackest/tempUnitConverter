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
}