import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sumOfBirthYears = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1]);

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sumOfBirthYears += birthYear;
            count++;
        }

        double average = (double) sumOfBirthYears / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

        scanner.close();
    }
}