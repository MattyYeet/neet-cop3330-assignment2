package example26;

import java.util.Formatter;
import java.util.Scanner;

import static java.lang.Math.log;

public class App {
    public static void main(String[] args) {
        double n, i, b, p, APR;
        PaymentCalculator Calculate = new PaymentCalculator();
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        b = input.nextDouble();
        b = (Math.ceil(b * 100))/100.0;
        input.nextLine();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextDouble() / 100;
        i = APR / 365;
        input.nextLine();

        System.out.print("What is the monthly payment you can make? ");
        p = input.nextDouble();
        p = (Math.ceil(p * 100))/100.0;
        input.nextLine();

        n = Calculate.calculateMonthsUntilPaidOff(b, i, p);
        Formatter fmt = new Formatter();
        fmt.format("%.0f", n);
        System.out.println("It will take you "+fmt+" months to pay off this card.");
    }
}
