package assignments.week4;

import java.util.Scanner;

public class BaseConversion {
    public static String convert(int num, int b) {

        int quotient = num / b;
        int remainder = num % b;

        String string = Integer.toString(remainder);

        if (quotient == 0) {
            return (string);
        } else {
            return (convert(quotient, b).concat(string));
        }
    }

    public static void main(String[] args) {
        int base10num;
        int base;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Aleenah's Base Conversion Program");
        System.out.print("Enter an integer: ");
        base10num = scnr.nextInt();
        System.out.print("Enter the base: ");
        base = scnr.nextInt();

        String message = convert(base10num, base);
        System.out.println(message);
    }
}
