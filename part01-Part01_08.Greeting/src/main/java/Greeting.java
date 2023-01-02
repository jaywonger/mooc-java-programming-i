
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        
        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String name = scanner.nextLine();
        
        // Write your program here
        System.out.println("Hi " + name);

    }
}
