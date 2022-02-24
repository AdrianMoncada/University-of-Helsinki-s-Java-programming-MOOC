
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                int line = Integer.valueOf(scanner2.nextLine());
                if (line <= upperBound && line >= lowerBound) {
                    listOfNumbers.add(line);
                    count++;
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: " + count);

    }

}
