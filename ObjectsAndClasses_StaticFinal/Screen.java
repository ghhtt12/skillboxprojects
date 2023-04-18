package ObjectsAndClasses_StaticFinal;

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

