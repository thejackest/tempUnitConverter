public class Celsius extends tempUnitConverter
{
    public Celsius ( float value) {
        super (value);
    }

    @Override
    public float toKelvin(){
        return this.getValue() + 273;
    }
}
