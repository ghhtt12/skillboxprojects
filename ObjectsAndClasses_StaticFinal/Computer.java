package ObjectsAndClasses_StaticFinal;

public class Computer {

    private  processor processor;
    private  am am;
    private StorageofInformation StorageofInformation;
    private Screen Screen;
    public Keyboard Keyboard;
    final String vendor;
    final String name;

    public Computer( processor processor,am am,StorageofInformation StorageofInformation, Screen Screen,Keyboard Keyboard, String vendor, String name) {
        this.processor = processor;
        this.am = am;
        this.StorageofInformation = StorageofInformation;
        this.Screen = Screen;
        this.Keyboard = Keyboard;
        this.vendor = vendor;
        this.name = name;
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

    public double Calculateweight(){
        double totalweight=Keyboard.weight+am.weight+Screen.weight+StorageofInformation.weight+processor.weight;
        return totalweight;
    }

    public void print(){
        processor.print();
        am.print();
        StorageofInformation.print();
        Screen.print();
        Keyboard.print();
    }

}

