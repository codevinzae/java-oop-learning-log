
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numofNum = 0;

        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else if (num > 0 || num < 0){
                System.out.println(num);
                numofNum = numofNum + 1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + numofNum);
    }
}
