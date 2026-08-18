import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positiveCount = positiveCount + 1;
                sum = sum + num;
            }
        }

        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / positiveCount;
            System.out.println(average);
        }
    }
}