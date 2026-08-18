
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNum = 0;
        int countNum = 0;

        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else if (num > 0 || num < 0){
                System.out.println(num);
                countNum = countNum + 1;
                sumNum = sumNum + num;
                continue;
            }
        }
        System.out.println("Number of numbers: " + countNum);
        System.out.println("Sum of the numbers: " + sumNum);
    }
}
