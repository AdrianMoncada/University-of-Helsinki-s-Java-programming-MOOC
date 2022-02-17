
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spacesToPrint = size - 1;

        for (int i = 1; i <= size; i++) {
            printSpaces(spacesToPrint);
            printStars(i);
            spacesToPrint--;

        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int j = height - 1;
        for (int i = 1; i <= height * 2; i += 2) {
            printSpaces(j);
            printStars(i);
            j--;
        }
        int counter = 0;
        while (counter < 2) {
            printSpaces(height - 2);
            printStars(3);
            counter++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        christmasTree(4);
        System.out.println("---");
    }
}
