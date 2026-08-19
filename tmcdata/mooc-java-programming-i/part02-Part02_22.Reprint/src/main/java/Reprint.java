import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int count = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i < count) {
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

//for loop version (my first try, bit while loop is needed for the course)
/*import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int n = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < n; i++){
            printText();
        }
    }
    public static void printText() {
         System.out.println("In a hole in the ground there lived a method");
    }
}
*/