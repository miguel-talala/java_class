import util.DolarConverter;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price?: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought");
        double dollarsBought = sc.nextDouble();
        double valueInReais = DolarConverter.currencyConverter(dollarPrice, dollarsBought);
        System.out.print("Amount to be paid in reais = $"+ valueInReais);



        sc.close();
    }
}
