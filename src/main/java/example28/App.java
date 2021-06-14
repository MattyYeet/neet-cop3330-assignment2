package example28;

//ask Create a flowchart before writing the program.

import java.util.Formatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int counter = 5;

        Formatter fmt = new Formatter();
        fmt.format("%.0f", ADD(counter));
        System.out.println("The total is "+fmt+".");
    }
    public static double ADD(int counter){
        Scanner input = new Scanner(System.in);
        int i;
        double a=0;
        for(i=0; i < counter; i++){
            System.out.print("Enter a number: ");
            a = a + input.nextDouble();
        }
        return a;
    }
}
