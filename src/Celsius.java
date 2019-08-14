public class Celsius extends tempUnitConverter
{
    public Celsius ( float value) {
        super (value);
    }

    @Override
    public float toKelvin(){
        return this.getValue() + 273;
    }
    
    @Override
    public float toFahrenheit(){
        return (float)9/5 * this.getValue() + 32;
    }
}
