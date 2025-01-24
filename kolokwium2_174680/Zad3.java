interface Sensor
{
    abstract double readValue(double value);
    abstract String getStatus();
    abstract void reset();
}
public class Zad3
{
    public abstract class TemperatureSensor implements Sensor
    {
        @Override
        public double readValue(double value)
        {
            return value;
        }
        @Override
        public String getStatus()
        {
            return "Status";
        }
        @Override
        public void reset()
        {
            System.out.println("Temperature Sensor Reset");
        }
    }
    public abstract class PressureSensor implements Sensor
    {
        @Override
        public double readValue(double value)
        {
            return value;
        }
        @Override
        public String getStatus()
        {
            return "Status";
        }
        @Override
        public void reset()
        {
            System.out.println("Pressure Sensor Reset");
        }
    }
}
