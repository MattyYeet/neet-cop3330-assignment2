package example29;

import java.util.Formatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.print("What is the rate of return? ");
        r = input.nextInt();
        if(r >= 0 && r <= 48 || r >= 58 && r <= 127){
            System.out.println("Sorry. That's not a valid input.");
        }
        Formatter fmt = new Formatter();
        fmt.format("%.0f", Calculate(r));
        System.out.println("It will take "+fmt+" years to double your initial investment.");
    }
    public static double Calculate(int rate){
        return 72.0 / rate;
    }
}
