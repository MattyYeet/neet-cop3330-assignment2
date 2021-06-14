package example26;

import static java.lang.Math.log;

public class PaymentCalculator {
        public double calculateMonthsUntilPaidOff(double a, double b, double c){
            double n;
            double r = (1 + b);
            n = ((-1.0/30) * log(1 + (a/c * (1 - Math.pow(r, 30))))) / log(r);
            return Math.ceil(n);
        }
}
