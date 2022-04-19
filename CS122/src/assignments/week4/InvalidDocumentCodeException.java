package assignments.week4;

import java.util.Scanner; 

public class InvalidDocumentCodeException extends Exception {
    public static void main(String[] args) throws DocumentException {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the designation: ");
        String input = scnr.next();

    try {
        if (input.charAt(0) == 'U' && input.length() == 2) {
            System.out.println("Unclassified business document");
        }
        else if (input.charAt(0) == 'C' && input.length() == 2) {
            System.out.println("Confidential business document");
        } 
        else if (input.charAt(0) == 'P' && input.length() == 2) {
            System.out.println("Proprietary business document");
        } else {
            throw new DocumentException("Invalid. Business designation must start with C, U, or P, and be 2 characters long.");
        }
}

        catch(DocumentException e) {
            System.out.println(e);
    }
}
}


