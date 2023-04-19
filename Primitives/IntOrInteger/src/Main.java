package Primitives.IntOrInteger.src;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        System.out.println("Коды букв русского алфавита:");
        char a='Ё';
        int s= (int)a;
        System.out.println(s+"-"+a);
        for (int i=1040;i<1106;i++){
            char b=(char) i;
            System.out.println(i+"-"+b);
        }
    }
}