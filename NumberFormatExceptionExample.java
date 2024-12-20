import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Number entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Ensure you enter a numeric value.");
        }
    }
}
