public class Kelvin extends tempUnitConverter {
    public Kelvin(float value) {
        super(value);
    }

    @Override
    public float toCelsius(){
        return this.getValue() - 273;
    }

}
