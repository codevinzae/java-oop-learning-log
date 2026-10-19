public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        Counter c2 = new Counter();

        System.out.println("c1: " + c1.value());
        System.out.println("c2: " + c2.value());

        c1.increase(5);
        c2.increase(10);

        System.out.println("c1: " + c1.value());
        System.out.println("c2: " + c2.value());

        c1.decrease(2);
        c2.decrease(3);

        System.out.println("c1: " + c1.value());
        System.out.println("c2: " + c2.value());
    }
}