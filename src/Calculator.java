
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        double num1 = sc.nextDouble();


        System.out.println("Enter Number 2: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the Function ('+', '-', '*', '/'): ");
        String func = sc.next();

        switch (func) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
            default -> System.out.println("Invalid Function");
        }

    }
}
