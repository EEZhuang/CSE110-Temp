package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public loat t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((this.getValue() - 32) / 9.0 * 5));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return "" + this.getValue() + " F";
    }
}