
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int newNumber = Integer.valueOf(scanner.nextLine());

        if (newNumber < 0) {
            System.out.println(newNumber * -1);
        } else {
            System.out.println(newNumber);
        }
    }
}
