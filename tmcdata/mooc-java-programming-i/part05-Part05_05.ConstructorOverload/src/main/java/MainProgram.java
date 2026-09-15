
public class MainProgram {

    public static void main(String[] args) {
        Product tapeMeasure = new Product("tape measure");
        Product plaster = new Product("plaster", "home improvement section");
        Product tyre = new Product("tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
