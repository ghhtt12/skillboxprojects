package ObjectsAndClasses_StaticFinal;

public class Basket {

    private static int count = 0;
    private static int countItems = 0;
    private static int countPrice = 0;


    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int totalWeight = 0;

    private boolean error = false;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 10000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCountPrice() {
        return countPrice;
    }

    public static int getCountItems() {
        return countItems;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCountItems(int count) {
        Basket.countItems += count;
    }

    public static void increaseCountPrice(int price,int count) {
        Basket.countPrice += (price*count);
    }

    public static void increaseAll(int count, int price) {
        increaseCountItems(count);
        increaseCountPrice(price,count);
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        if (error) {
            return;
        }
        totalWeight += (count * weight);
        Basket.increaseAll(count,price);
    }


    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public static double pricetoCount(){
        double i= Basket.countPrice/ Basket.countItems;
        return i;
    }

    public static double pricetoBasketCount(){
        double i= Basket.countPrice/ Basket.count;
        return i;
    }

    public void add(String name, int price, int count) {
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}