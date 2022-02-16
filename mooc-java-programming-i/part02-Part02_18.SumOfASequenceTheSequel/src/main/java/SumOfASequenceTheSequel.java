
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");

        int smallerNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Second number?");

        int largerNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = smallerNumber; i <= largerNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
    }
}
