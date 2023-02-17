public class Main {
    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////    COMPOSITION     //////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ComputerCase theCase = new ComputerCase("2208","Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadPrograms("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
