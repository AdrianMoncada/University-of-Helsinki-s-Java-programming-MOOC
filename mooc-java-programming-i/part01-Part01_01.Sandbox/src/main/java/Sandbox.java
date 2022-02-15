import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        int dividend = 3;
        int divisor = 2;

        double result = dividend / divisor * 1.0;
        System.out.println(result);
    }
}
