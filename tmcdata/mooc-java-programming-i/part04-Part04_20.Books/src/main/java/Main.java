import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> details = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            details.add(new Book(title, page, publicationYear));
        }

        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        if(info.equals("everything")){
            for(Book detail : details){
                System.out.println(detail);
            }
        }else if(info.equals("name")){
            for(Book detail : details){
                System.out.println(detail.getTitle());
            }
        }
    }
        
}

