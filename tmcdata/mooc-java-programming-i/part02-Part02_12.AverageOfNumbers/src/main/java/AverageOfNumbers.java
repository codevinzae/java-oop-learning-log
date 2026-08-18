
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double countNum = 0.0;
        double sumNum = 0;
        double aveNum = 0.0;

        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else if (num > 0 || num < 0){
                System.out.println(num);
                countNum = countNum + 1;
                sumNum = sumNum + num;
                aveNum = sumNum/countNum;

            }
        }
        
        System.out.println("Average of the numbers: " + aveNum);
    }
}
