
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int first = Integer.valueOf(scanner.nextLine());

        // Identifying the operation and declaring a variable for the result
        int product = first * first;

        // Printing the result of the operation
        System.out.println(product);
    }
}
