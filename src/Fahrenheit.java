public class Fahrenheit extends tempUnitConverter
{
    public Fahrenheit ( float value) {
        super (value);
    }

    //these two methods will convert fahrenheit into two other different units
    @Override
    public float toKelvin(){
        return (float)5/9 * (this.getValue() - 32) + 273;
    }

    @Override
    public float toCelsius(){
        return (float)5/9 * (this.getValue() - 32);
    }
}
