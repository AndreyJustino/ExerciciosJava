package util;

public class CurrencyConverter {

    public static double converter(double dollarPrice, double dollarQuant){
        double calc = dollarPrice * dollarQuant;

        return (calc * 6 / 100) + calc;
    }
}
