
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            System.out.println("Search for? " + input);
            String searched = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) == searched){
                System.out.println(searched + " was found!");
            }else {
                System.out.println(searched + " was not found!");
            }
        }
    }
}
