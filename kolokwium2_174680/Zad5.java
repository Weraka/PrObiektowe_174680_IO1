interface Converter
{
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
}
public class Zad5
{
    public abstract class CurrencyConverter implements Converter
    {
        @Override
        public double convertToEuro(double amount)
        {
            return amount*4.8;
        }
        @Override
        public double convertToUSD(double amount)
        {
            return amount*4.3;
        }

    }
    public abstract class UnitConverter implements Converter
    {
        @Override
        public double getConversionRate(String currency)
        {
            if(currency == "EUR")
            {
                return convertToUSD(4.8);
            }
            if(currency == "USD")
            {
                return convertToEuro(4.3);
            }
            return 0;
        }
    }
}
