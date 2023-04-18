package ObjectsAndClasses_StaticFinal;

public class Main {
    public static void main(String[] args){
        Processor processor= new Processor(34,12,"intel",456);
        Processor processor1= new Processor(344,112,"Amd",46);
        Am am= new Am(123,34,"GHH");
        Am am1= new Am(12,3,"GHH1");
        StorageofInformation StorageofInformation=new StorageofInformation(345,56, Type.HDD);
        StorageofInformation StorageofInformation1=new StorageofInformation(35,5, Type.SSD);
        Screen Screen = new Screen(23,45,TypeScreen.IPS);
        Screen Screen1 = new Screen(223,145,TypeScreen.VA);
        Keyboard Keyboard= new Keyboard("ter",true,12);
        Keyboard Keyboard1= new Keyboard("er",false,124);
        Computer Computer=new Computer(processor,am,StorageofInformation,Screen,Keyboard,"djf","ter");
        System.out.println(Computer.Calculateweight());
        Computer.print();
        Computer.setAm(am1);
        Computer.setKeyboard(Keyboard1);
        Computer.setProcessor(processor1);
        Computer.setScreen(Screen1);
        Computer.setStorageofInformation(StorageofInformation1);
        System.out.println();
        System.out.println(Computer.Calculateweight());
        Computer.print();
    }
}
