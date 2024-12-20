import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array index to access: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index. Please enter a valid index within the range of 0 to " + (array.length - 1) + ". Details: " + e.getMessage());
        }
    }
}