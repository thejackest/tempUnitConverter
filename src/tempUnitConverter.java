public class tempUnitConverter {
    private float value;

    public tempUnitConverter(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    //methods to override
    public float toKelvin(){return value;}
    public float toCelsius(){return value;}
    public float toFahrenheit(){return value;}
}
