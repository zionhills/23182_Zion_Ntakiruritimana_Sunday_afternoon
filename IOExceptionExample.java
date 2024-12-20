// Example 1: IOException
import java.io.*;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path to read: ");
        String filePath = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println("File content: " + reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException occurred: Unable to access the specified file. Please check the file path and try again. Details: " + e.getMessage());
        }
    }
}