
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println((num * num));
    }
}
