
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNegatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                sumOfNegatives = sumOfNegatives + 1;
                continue;
            }

        }
        System.out.println("Number of negative numbers: " + sumOfNegatives);

    }
}
