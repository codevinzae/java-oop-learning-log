
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second num num: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        int sum = num1 + num2;
        double squareRoot = Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}
