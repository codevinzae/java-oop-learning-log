
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        double qquo = (num1 + num2)/2.0;
        System.out.println("The average is " + qquo);

    }
}
