
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                int number = Integer.valueOf(fileScanner.nextLine());
                if(number <= upperBound && number>=lowerBound){
                    count++;
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        scanner.close();
        System.out.println("Numbers: " + count);
    }

}
