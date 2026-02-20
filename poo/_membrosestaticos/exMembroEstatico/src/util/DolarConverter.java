package util;

public class DolarConverter {

    public static final double IOF = 0.06 ;

    public static double currencyConverter(double dollarPrice, double dollarBought){
        double basicValue =  dollarPrice* dollarBought;
        return basicValue + basicValue * IOF;
    }

}
