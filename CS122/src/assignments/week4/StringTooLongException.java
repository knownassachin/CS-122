package assignments.week4;

import java.util.Scanner;

public class StringTooLongException {
    public static void main(String[] args) throws StringException {

        System.out.println("Type something");
        Scanner scnr = new Scanner(System.in);

        try {
            System.out.println("Type DONE to stop");
            String message = scnr.nextLine();

        while (!message.equals("DONE")) {
            if (message.length() > 20) {
                throw new StringException(message);
            }

            System.out.println("Type DONE to stop");
            message = scnr.nextLine();
        }
    }

            catch (StringException e) {
                System.out.println("String is too long. Error: " + e);
            }
        }
    }


