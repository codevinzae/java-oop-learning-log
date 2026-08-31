
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.equals("")) {
                break;
            }
            String[] pieces = phrase.split(" ");
            for (String piece : pieces) {
                if(piece.contains("av")){
                    System.out.println(piece);
                }
            }
        }
        scanner.close();
    }
}
