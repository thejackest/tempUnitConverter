public class Fahrenheit extends tempUnitConverter
{
    public Fahrenheit ( float value) {
        super (value);
    }

    @Override
    public float toKelvin(){
        return (float)5/9 * (this.getValue() - 32) + 273;
    }
}
