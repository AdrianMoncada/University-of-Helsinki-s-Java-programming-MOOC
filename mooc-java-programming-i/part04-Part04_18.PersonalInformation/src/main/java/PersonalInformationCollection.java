
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, lastName, idNumber));
        }

        for (PersonalInformation personalInfo : infoCollection) {
            System.out.println(personalInfo.getFirstName() + " " + personalInfo.getLastName());
            
        }

    }
}
