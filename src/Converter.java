
public class Converter {

    private double fahrenheit;

    public Converter(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    /**
     *
     * @param fahrenheit degrees in fahrenheit user inputted
     * @return conversion in celsius
     */
    public static double calcCelsius (double fahrenheit){
        return Math.round(((fahrenheit - 32) * 5 / 9) * 100) / 100.0;
    }

    /**
     *
     * @param fahrenheit degrees in fahrenheit user inputted
     * @return conversion in kelvin
     */
    public static double calcKelvin (double fahrenheit){
        return Math.round(((fahrenheit - 48) * 5 / 9) * 100.0) / 100.0;
    }

}
