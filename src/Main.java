import adapters.ConverterAdapter;
import converters.IMetricConverter;
import converters.ImperialConverter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImperialConverter imperialConverter = new ImperialConverter();
        IMetricConverter converter = new ConverterAdapter(imperialConverter);

        double celsius = 25;

        System.out.printf("%.2f °C = %.2f °F%n", celsius, converter.convertCToF(celsius));
    }
}