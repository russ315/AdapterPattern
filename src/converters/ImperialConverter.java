package converters;

public class ImperialConverter {
    public double getTempInF(double celsius) {
        return (celsius * 9 / 5) + 32; // °C → °F
    }

    public double getTempInC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // °F → °C
    }
}
