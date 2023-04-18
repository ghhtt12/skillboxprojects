package ObjectsAndClasses_StaticFinal;

public class Processor {
    final int frequancy;
    final int cores;
    final String manufactor;
    final double weight;

    public Processor(int frequancy, int cores, String manufactor, double weight) {
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
