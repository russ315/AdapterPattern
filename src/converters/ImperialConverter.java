package converters;

public class ImperialConverter {
    public double getTempInF(double celsius) {
        return (celsius * 9 / 5) + 32; // °C → °F
    }

}
