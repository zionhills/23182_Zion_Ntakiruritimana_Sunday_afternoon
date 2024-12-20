import java.util.Scanner;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an object type (Integer or String): ");
        String inputType = scanner.nextLine();

        Object x = inputType.equalsIgnoreCase("Integer") ? new Integer(0) : "Not an Integer";

        try {
            String y = (String) x;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Invalid cast operation. Ensure the object type matches the target type.");
        }
    }
}