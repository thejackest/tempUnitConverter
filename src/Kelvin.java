public class Kelvin extends tempUnitConverter {
    public Kelvin(float value) {
        super(value);
    }

    @Override
    public float toCelsius(){
        return this.getValue() - 273;
    }

    @Override
    public float toFahrenheit(){
        return (float)9/5*(this.getValue() - 273) + 32;
    }
}
