package adapters;import converters.IMetricConverter;
import converters.ImperialConverter;

public class ConverterAdapter implements IMetricConverter {
    private final ImperialConverter imperialConverter;

    public ConverterAdapter(ImperialConverter imperialConverter) {
        this.imperialConverter = imperialConverter;
    }

    @Override
    public double convertCToF(double celsius) {
        return imperialConverter.getTempInF(celsius);
    }

    @Override
    public double convertFToC(double fahrenheit) {
        return imperialConverter.getTempInC(fahrenheit);
    }
}
