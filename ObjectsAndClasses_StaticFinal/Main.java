package ObjectsAndClasses_StaticFinal;

public class Main {
    public static void main(String[] args){
                Basket basket = new Basket(15556565);
                System.out.println(Basket.getCountPrice());
                basket.add("Milk", 42,1,12.34);
                System.out.println(Basket.getCountPrice());
                basket.add("Bread", 1,2,12.4);
                System.out.println(Basket.getCountPrice());
                basket.add("Meet", 2,134,45.123);
                System.out.println(Basket.pricetoCount());
                System.out.println(Basket.pricetoBasketCount());
                System.out.println(Basket.getCount());
                System.out.println(Basket.getCountPrice());
                System.out.println(Basket.getCountItems());
    }
}
