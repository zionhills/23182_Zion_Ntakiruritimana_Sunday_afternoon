import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (or press Enter to leave it null): ");
        String str = scanner.nextLine();

        if (str.isEmpty()) {
            str = null;
        }

        try {
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to access a null reference.");
        }
    }
}