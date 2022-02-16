
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());

            if (inputNumber == -1) {
                break;
            }

            sum = sum + inputNumber;
            count++;

            if (inputNumber % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount++;
            }
        }
        double avarage = (double) sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avarage);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

    }
}
