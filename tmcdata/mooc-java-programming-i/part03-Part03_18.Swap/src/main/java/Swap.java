import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        int secondIndex = Integer.valueOf(scanner.nextLine());

        int helper = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = helper;

        System.out.println("");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}