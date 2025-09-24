import adapters.ConverterAdapter;
import converters.IMetricConverter;
import converters.ImperialConverter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImperialConverter imperialConverter = new ImperialConverter();
        IMetricConverter converter = new ConverterAdapter(imperialConverter);

        double celsius = 25; // could be any input value
        double fahrenheit = 77; // could be any input value

        System.out.printf("%.2f °C = %.2f °F%n", celsius, converter.convertCToF(celsius));
        System.out.printf("%.2f °F = %.2f °C%n", fahrenheit, converter.convertFToC(fahrenheit));
    }
}