
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int wins = 0;
        int loses = 0;

        while (true) {
            System.out.println("File:");
            String file = scan.nextLine();
            System.out.println("Team:");
            String team = scan.nextLine();

            try ( Scanner scanner = new Scanner(Paths.get(file))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    String[] parts = line.split(",");
                    String firstTeam = parts[0];
                    String secondTeam = parts[1];
                    int firstTeamPoints = Integer.valueOf(parts[2]);
                    int secondTeamPoints = Integer.valueOf(parts[3]);

                    if (firstTeam.equals(team) || secondTeam.equals(team)) {
                        counter++;

                        if (parts[0].equals(team) && firstTeamPoints > secondTeamPoints) {
                            wins++;
                        } else if (parts[1].equals(team) && secondTeamPoints > firstTeamPoints) {
                            wins++;
                        } else {
                            loses++;
                        }
                    }
                }
            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
            break;
        }

    }
}
