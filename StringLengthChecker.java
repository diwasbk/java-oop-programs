import java.util.Scanner;

class InvalidStringLengthException extends Exception {

    public InvalidStringLengthException(String message) {
        super(message);
    }
}

public class StringLengthChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String userInput = sc.nextLine();

        try {
            if (userInput.length() > 5 && userInput.length() < 20) {
                System.out.println("Entered string is: " + userInput);
            }else{
                throw new InvalidStringLengthException("String length should be between 5 and 20 characters.");
            }  
        } catch (InvalidStringLengthException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}