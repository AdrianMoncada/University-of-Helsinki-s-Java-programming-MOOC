
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publication = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publication));
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        for (Book book : books) {
            if (answer.contains("everything")) {
                System.out.println(book.getEverything()); 
            } else if (answer.contains("name")) {
                System.out.println(book.getName());
            }
        }

    }
}
