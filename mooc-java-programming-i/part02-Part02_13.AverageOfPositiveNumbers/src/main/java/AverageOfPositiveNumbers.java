
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double positiveNumbers = 0;
        double amount = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            if (number > 0) {
                positiveNumbers = positiveNumbers + number;
                amount = amount + 1;
            }
        }
        if (positiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avarage = positiveNumbers / amount;
            System.out.println(avarage);
        }

    }
}
