package ObjectsAndClasses_StaticFinal;

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
