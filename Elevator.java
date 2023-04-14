public class Main {
    public static void main(String[] args) {
       /* Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/
        Dimensions Dimensions = new Dimensions(123, 23, 143);
        Dimensions Dimensions1 = new Dimensions(1, 2, 3);
        Cargo Cargo = new Cargo(345, "там", Dimensions, true, "135774456", false);
        Cargo.PrintCargo(Cargo);
        Cargo.PrintCargo(Cargo.Cargoadress("пушкинская"));
        Cargo.PrintCargo(Cargo.Cargoweight(123));
        Cargo.PrintCargo(Cargo.Cargodimensions(Dimensions1));
        Cargo.PrintCargo(Cargo);
    }
}

class Dimensions {
    private final int high;
    private final int width;
    private final int lengh;

    public Dimensions(int high, int width, int lengh) {
        this.high = high;
        this.width = width;
        this.lengh = lengh;
    }

    public int volumeCalculate() {
        int volume = high * width * lengh;
        return volume;
    }

    public int getHigh(){
        int high=this.high;
        return high;
    }

    public int getWidth(){
        int width=this.width;
        return width;
    }

    public int getLengh(){
        int lengh=this.lengh;
        return lengh;
    }
}

class Cargo {

    private final Dimensions dimensions;

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo(int weight, String adress, Dimensions dimensions, boolean swap, String regNumber, boolean fragile) {
        this.weight = weight;
        this.adress = adress;
        this.dimensions = dimensions;
    }

    private final int weight;
    private final String adress;
    boolean swap;
    String regNumber="ejnvierhnwei";
    boolean fragile=false;

    public int getWeight() {
        return weight;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isSwap() {
        return swap;
    }

    public Cargo Cargoweight(int weight) {
        return new Cargo(weight, adress, dimensions, swap, regNumber, fragile);
    }

    public Cargo Cargoadress(String adress) {
        return new Cargo(weight, adress, dimensions, swap, regNumber, fragile);
    }

    public Cargo Cargodimensions(Dimensions dimensions) {
        return new Cargo(weight, adress, dimensions, swap, regNumber, fragile);
    }

    public int PrintCargoweight(Cargo Cargo){
        int i=Cargo.getWeight();
        return i;
    }

    public String PrintCargoAdress(Cargo Cargo){
        String st=Cargo.getAdress();
        return st;
    }

    public String PrintCargoRegNumber(Cargo Cargo){
        String regn=Cargo.getRegNumber();
        return regn;
    }

    public boolean PrintCargoFrangile(Cargo Cargo){
        boolean b=Cargo.isFragile();
        return b;
    }

    public boolean PrintCargoSwap(Cargo Cargo){
        boolean s=Cargo.isSwap();
        return s;
    }

    public int PrintCargo(Cargo Cargo){
        System.out.println("Вес Груза:"+Cargo.PrintCargoweight(Cargo)+" Адрес Груза:"+Cargo.PrintCargoAdress(Cargo)+" Габариты Груза:"+dimensions.getHigh()+"*"+dimensions.getHigh()+"*"+dimensions.getLengh()+" Адрес "+getDimensions()+" ОбЪем "+dimensions.volumeCalculate()+" Рег.Номер Груза:"+Cargo.PrintCargoRegNumber(Cargo)+" Хрупкость Груза:"+Cargo.PrintCargoFrangile(Cargo)+" Переворчиваемость груза:"+Cargo.PrintCargoSwap(Cargo));
        return 0;
    }
}

class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;


    Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        if (currentFloor >= maxFloor) {
            System.out.println("Вы уже на максимальном этаже");
            return;
        }
        currentFloor += 1;
    }

    public void moveDown() {
        if (currentFloor <= minFloor) {
            System.out.println("Вы уже на минимальном этаже");
        }
        currentFloor -= 1;
    }

    public void move(int floor) {
        if ((floor <= minFloor) || (floor >= maxFloor)) {
            System.out.println("Введенен невправильный этаж");
            return;
        }
        while (currentFloor != floor) {
            if (currentFloor < floor) {
                moveUp();
            } else if (currentFloor > floor) {
                moveDown();
            }
            System.out.println("Текущий этаж:" + currentFloor);
        }
    }

}
