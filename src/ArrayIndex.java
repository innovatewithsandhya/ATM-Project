
import java.util.Scanner;

// Custom Exception
class InvalidStringException extends Exception {
    InvalidStringException(String message) {
        super(message); // store message
    }
}

class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = sc.nextLine();

        try {
            if (word.length() % 2 != 0) {
                throw new InvalidStringException("Error! String cannot have odd length.");
            }
            System.out.println("The entered String is VALID.");
        } catch (InvalidStringException e) {
            System.out.println(e.getMessage()); // print custom message
        }
    }
}
