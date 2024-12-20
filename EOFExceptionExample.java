import java.io.*;
import java.util.Scanner;

public class EOFExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the binary file to read: ");
        String fileName = scanner.nextLine();

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            while (true) {
                System.out.println(dis.readUTF());
            }
        } catch (EOFException e) {
            System.out.println("EOFException: Attempted to read beyond the end of the file. Ensure the file content matches the expected format.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}