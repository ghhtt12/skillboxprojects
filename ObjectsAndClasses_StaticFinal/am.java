package ObjectsAndClasses_StaticFinal;
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
