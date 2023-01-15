
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name = "";
        String oldestName = "";
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            age = Integer.valueOf(parts[1]);
            name = parts[0];
            if(age>oldest) { 
                oldest = age;
                oldestName = name;
            } 
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
