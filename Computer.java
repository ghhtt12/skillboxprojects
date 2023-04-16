public class Computer {

    private  processor processor;
    private  am am;
    private StorageofInformation StorageofInformation;
    private Screen Screen;
    public Keyboard Keyboard;
    final String vendor;
    final String name;

    public double Calculateweight(Computer computer){
        double totalweight=computer.Keyboard.weight+computer.am.weight+computer.Screen.weight+computer.StorageofInformation.weight+computer.processor.weight;
        return totalweight;
    }

    public void setKeyboard(Keyboard keyboard) {
        Keyboard = keyboard;
    }

    public void setProcessor(processor processor) {
        this.processor = processor;
    }

    public void setScreen(Screen screen) {
        Screen = screen;
    }

    public void setStorageofInformation(StorageofInformation storageofInformation) {
        StorageofInformation = storageofInformation;
    }

    public void setAm(am am) {
        this.am = am;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public Keyboard getKeyboard() {
        return Keyboard;
    }

    public Screen getScreen() {
        return Screen;
    }

    public StorageofInformation getStorageofInformation() {
        return StorageofInformation;
    }

    public am getAm() {
        return am;
    }

    public processor getProcessor() {
        return processor;
    }

    public Computer(processor processor,am am,StorageofInformation storageofInformation, Screen screen,Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.am = am;
        StorageofInformation = storageofInformation;
        Screen = screen;
        Keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public void print(){
        processor.print();
        am.print();
        StorageofInformation.print();
        Screen.print();
        Keyboard.print();
    }




}

class processor {
    final int frequancy;
    final int cores;
    final String manufactor;
    final double weight;

    public processor(int frequancy, int cores, String manufactor, double weight) {
        this.frequancy = frequancy;
        this.cores = cores;
        this.manufactor = manufactor;
        this.weight = weight;
    }
    public void print(){
        System.out.println("Процессор:");
        System.out.println("Частота:"+frequancy);
        System.out.println("Количество ядер:"+cores);
        System.out.println("Производитель:"+manufactor);
        System.out.println("Вес:"+weight);
    }
}

class am {
    final String type;
    final int volume;
    final double weight;

    public am(int volume, int weight, String type) {
        this.volume = volume;
        this.weight = weight;
        this.type = type;
    }
    public void print(){
        System.out.println("ОЗУ");
        System.out.println("Тип накопителя:"+type);
        System.out.println("Объем накопителя:"+volume);
        System.out.println("Вес"+weight);
    }
}

class StorageofInformation {
    type type;
    final int volume;
    final double weight;

    public StorageofInformation(int volume, int weight, type type) {
        this.volume = volume;
        this.weight = weight;
        this.type = type;
    }
    public void print(){
        System.out.println("Накопитель:");
        System.out.println("Тип накопителя:"+type);
        System.out.println("Вместимость:"+volume);
        System.out.println("Вес:"+weight);
    }
}

class Screen {
    final int diagonal;
    TypeScreen typeScreen;
    final double weight;

    public Screen(int diagonal, int weight, TypeScreen typeScreen) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.typeScreen = typeScreen;
    }
    public void print(){
        System.out.println("Экран:");
        System.out.println("Диаганоль экрана:"+diagonal);
        System.out.println("Тип экрана:"+typeScreen);
        System.out.println("Вес:"+weight);
    }
}

class Keyboard {
    final String type;
    final boolean light;
    final int weight;
    public Keyboard(String type, boolean light, int weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }
    public void print(){
        System.out.println("Процессор:");
        System.out.println("Подсвтека:"+light);
        System.out.println("Вес клавиатуры"+weight);
        System.out.println("Тип клавиатуры:"+type);
    }
}