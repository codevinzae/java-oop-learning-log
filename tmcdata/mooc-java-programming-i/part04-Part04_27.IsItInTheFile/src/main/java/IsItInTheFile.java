
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
        try (Scanner fileScanner = new scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
            String line = scanner.nextLine();
            
            if(line.equals(searchedFor)){
                found = true;
                break;
            }

            if(found){
                System.out.println("Found!")
            }else{
                System.out.println
            }

            }
        }catch (Exceptions e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
