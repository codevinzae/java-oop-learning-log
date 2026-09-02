
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();

        System.out.println("Enter numbers: ");
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }

        totalSum.addNumber(input);

        if(input % 2 == 0){
            evenSum.addNumber(input);
        }else{
            oddSum.addNumber(input);
        }

        }

        //given block of codes from MOOC to print
        System.out.println("Count: " + totalSum.getCount());
        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Average: " + totalSum.average());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}
