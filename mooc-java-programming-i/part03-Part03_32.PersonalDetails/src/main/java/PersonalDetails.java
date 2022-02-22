
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        int count = 0;
        
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            
            

            int birthYear = Integer.valueOf(pieces[1]);
            int NumberOfLetters = pieces[0].length();
            
            if(longestName.length() < NumberOfLetters){
                longestName = pieces[0];  
            }
            sum = sum + birthYear;
            count++;
        }
        
        double avg = (double) sum / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);

    }
}
