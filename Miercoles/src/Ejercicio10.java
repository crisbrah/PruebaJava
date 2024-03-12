import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Ingrese la cantidad de dolares a convertir: 50
        Ingrese el tipo de cambio: 3.5
        La cantidad de soles es 175
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad:");
        int cantidad=sc.nextInt();
        System.out.println("ingrese tipo de cambio:");
        double cambio= sc.nextDouble();
        double total=cantidad*cambio;
        System.out.println("la cantidad es "+total);

    }
}
