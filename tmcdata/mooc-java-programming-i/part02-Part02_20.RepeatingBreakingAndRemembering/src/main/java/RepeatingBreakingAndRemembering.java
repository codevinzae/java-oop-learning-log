import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbersNum = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += num;
            numbersNum++;

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        double ave = (double) sum / numbersNum;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersNum);
        System.out.println("Average: " + ave);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}