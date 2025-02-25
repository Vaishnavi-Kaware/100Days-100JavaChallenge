import java.util.Scanner;
import java.util.InputMismatchException;

public class W05_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int sum = 0;

        try {
            int length = sc.nextInt(); // Read the length of the array
            int[] name = new int[length]; // Create an array

            // Traverse the array to read input and calculate sum
            for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt(); // May throw InputMismatchException
                sum += name[i]; // Add to sum
            }

            System.out.println(sum); // Print total sum
        } catch (InputMismatchException e) {
            System.out.print("You entered bad data.");
        }
    }
}
