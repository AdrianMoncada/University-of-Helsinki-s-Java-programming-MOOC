
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");

        int inputNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = inputNumber; i > 0; i--) {
            sum = sum + inputNumber;
            inputNumber--;
        }

        System.out.println("The sum is " + sum);

    }
}
