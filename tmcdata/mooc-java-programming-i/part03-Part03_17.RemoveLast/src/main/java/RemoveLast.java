import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(removeLast(strings));  
    }
    public static void removeLast(ArrayList<String> strings){
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings); 
    }
}