package Ejercicio3;

import Ejercicio2.Computer;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Computer> listacomputadoras= new ArrayList<>();
        ComputerStore computerStore1=new ComputerStore(
                listacomputadoras,
                "Lenovo",
                "Jr los sauces 244");


        System.out.println("------------------------");
        System.out.println(computerStore1.getSizeListComputers());

        //ComputerStore computerStore2 = new ComputerStore()
        Computer computer1 = new Computer(
                "DELL",
                "XXXXX",
                8,
                299);

        Computer computer2 = new Computer(
                "HP",
                "YYYY",
                12,
                512);

        Computer computer3 = new Computer(
                "LENOVO",
                "MMMMM",
                32,
                1024);

        // agregando computadora a la tienda
        computerStore1.addComputer(computer1);
        computerStore1.addComputer(computer2);
        computerStore1.addComputer(computer3);

       //System.out.println(computerStore1.getSizeListComputers());

        //computerStore1.printInfoComputers();
        computerStore1.filterRam(11);
    }
}
