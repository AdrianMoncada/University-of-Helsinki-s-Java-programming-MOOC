
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int newNumber = Integer.valueOf(scanner.nextLine());
        
        int multiplySelf = newNumber * newNumber;
        
        System.out.println(multiplySelf);
    }
}
