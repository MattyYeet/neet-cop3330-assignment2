package example36;
//NOT DONE
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Calculator calc = new Calculator();
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Double> LIST = new ArrayList<>();
    public static void main(String[] args) {
        while(true) {
            System.out.print("Enter a number: ");
            LIST.add(input.nextDouble());
            if (LIST.contains("done")) {
                break;
            }
        }
        calc.Average(LIST);
        calc.Min(LIST);
        calc.Max(LIST);
        calc.STD(LIST);
    }
}
