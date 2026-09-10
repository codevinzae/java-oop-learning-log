
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();

                String[] detail = line.split(",");
                String name = detail[0];
                int age = Integer.valueOf(detail[1]);

                for(Person person : persons){
                    System.out.println(person);
                }

                persons.add(new Person(name, age));
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        return persons;
    }
}
