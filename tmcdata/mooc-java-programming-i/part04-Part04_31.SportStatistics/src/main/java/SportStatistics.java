import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }

                //[0] Home, [1] Visitor, [2] Home Pts, [3] Visitor Pts
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                
                if (homeTeam.equals(team)) {
                    gamesPlayed++;
                    if (homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (visitingTeam.equals(team)) {
                    gamesPlayed++;
                    if (visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}