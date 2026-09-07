import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();

                String[] detail = line.split(",");
                String name = detail[0];
                int age = Integer.valueOf(detail[1]);
                
                if(age == 1){
                    System.out.println(name + ", age: " + age + " year");
                }else{
                    System.out.println(name + ", age: " + age + " years");
                }

            }
        }catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        scanner.close();
    }
}
