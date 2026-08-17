
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = scanner.nextLine();
        System.out.println("Give an integer: ");
        int ingr = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double doub = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean bol = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + ingr);
        System.out.println("You gave the double " + doub);
        System.out.println("You gave the boolean " + bol);


    }
}
