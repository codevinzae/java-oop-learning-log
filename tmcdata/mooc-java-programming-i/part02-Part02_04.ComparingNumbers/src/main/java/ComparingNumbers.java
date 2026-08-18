
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second num: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2 + ".");
        }else if(num1 < num2){
            System.out.println(num1 + " is smaller than " + num2 + ".");
        }else{
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
    }
}
