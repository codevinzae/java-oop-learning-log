
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase();
        System.out.println(counter);

        counter.decrease();
        System.out.println(counter);

        counter.increaseee(30);
        System.out.println(counter);
        
        counter.decreaseee(20);
        System.out.println(counter);
    }
}
