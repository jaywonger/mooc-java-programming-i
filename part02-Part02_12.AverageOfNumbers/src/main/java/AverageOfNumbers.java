
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                sum += number;
                count++;
            } 
        }
        double average = (sum *1.0)/count;
        System.out.println("Average of the numbers: " + average);
    }
}
