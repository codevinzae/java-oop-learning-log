
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);
        //print
        counter.printValue();
        //decrement
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        //reset
        counter.reset();
        counter.printValue();
    }
}
