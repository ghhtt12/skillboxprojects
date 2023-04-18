package ObjectsAndClasses_StaticFinal;

public class StorageofInformation {
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
