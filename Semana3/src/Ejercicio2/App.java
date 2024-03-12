package Ejercicio2;

public class App {
    public static void main(String[] args) {
        Computer pc01=new Computer("HP","intel",12,256);
        Computer pc02=new Computer("Lenovo","Thinkpad",16,1024);
        pc01.printInfo();
        System.out.println("-----------------");
        pc02.printInfo();

        pc01.incrementRam(4);
        System.out.println("Computer 1 Modificado");
        pc01.printInfo();
    }
}
