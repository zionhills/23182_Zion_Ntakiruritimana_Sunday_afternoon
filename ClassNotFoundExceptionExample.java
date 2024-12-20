import java.util.Scanner;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name to load: ");
        String className = scanner.nextLine();

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}