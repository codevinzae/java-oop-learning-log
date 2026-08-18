
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negNum = 0;

        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else if (num > 0){
                System.out.println(num);
                continue;
            }else {
                System.out.println(num);
                negNum = negNum + 1;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + negNum);
    }
}
