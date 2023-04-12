public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(123);
        basket.add("Milk", 42,1,12.34);
        basket.add("Bread", 1,2,12.4);
        basket.add("Meet", 2,134,45.123);
        System.out.println(basket.getTotalWeight());
        System.out.println();
        System.out.println(new Arithmetic(12,44).max());
        System.out.println(new Arithmetic(44,12).max());
        System.out.println(new Arithmetic(44,44).max());
        System.out.println(new Arithmetic(45,23).min());
        System.out.println(new Arithmetic(23,45).min());
        System.out.println(new Arithmetic(23,23).min());
        System.out.println(new Arithmetic(23,45).sum());
        System.out.println(new Arithmetic(34,56).mult());
    }
}
