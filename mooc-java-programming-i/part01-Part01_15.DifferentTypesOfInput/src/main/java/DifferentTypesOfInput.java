
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String newString = scan.nextLine();
        
        System.out.println("Give an integer:");
        int newInteger = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double newDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean newBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + newString);
        System.out.println("You gave the integer " + newInteger);
        System.out.println("You gave the double " + newDouble);
        System.out.println("You gave the boolean " + newBoolean);
        
        
        
    }
}
