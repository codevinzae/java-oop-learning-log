
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.equals("")) {
                break;
            }
            String[] pieces = phrase.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
    }
}

// The code I provided before I got it correct
/*
 * (import java.util.Scanner;
 * 
 * public class LineByLine {
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * System.out.print("Enter phrase: ");
 * String phrase = scanner.nextLine();
 * 
 * String[] pieces = phrase.split(" ");
 * for(int i=0; i<pieces.length; i++){
 * System.out.println(pieces[i]);
 * }
 * 
 * }
 * }
 */