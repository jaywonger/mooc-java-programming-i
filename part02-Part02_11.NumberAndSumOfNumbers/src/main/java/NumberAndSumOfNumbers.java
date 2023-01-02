
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                count1 += number;
                count2++;
            } 
        }
        System.out.println("Number of numbers: " + count2);
        System.out.println("Sum of the numbers: " + count1);
    }
}
