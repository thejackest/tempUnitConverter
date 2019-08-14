public class Kelvin extends tempUnitConverter {
    public Kelvin(float value) {
        super(value);
    }

    //these two methods will convert kelvin into two other different units
    @Override
    public float toCelsius(){
        return this.getValue() - 273;
    }

    @Override
    public float toFahrenheit(){
        return (float)9/5 * (this.getValue() - 273) + 32;
    }
}
