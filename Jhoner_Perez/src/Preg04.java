import java.util.Scanner;

public class Preg04 {
    public static void main(String[] args) {
        //Escriba un programa en el que el usuario debe adivinar un número aleatorio
        // entre 1 y 100. El programa proporcionará pistas si el número es
        // demasiado alto o demasiado bajo. El juego continuará hasta que el
        // jugador adivine correctamente el número. Al final, imprima el número
        // y la cantidad de intentos realizados.
        Scanner sc = new Scanner(System.in);

        int aleatorio=50;
        int contador=1;
        boolean esPrimo = true;
        while(esPrimo)
        {
            System.out.println("Ingrese el número a adivinar: ");
            int n= sc.nextInt();
            if (n<aleatorio)
            {
                System.out.println("Demasiado bajo");
                contador=contador+1;
            }
            else if (n>aleatorio) {
                System.out.println("Demasiado alto");
                contador=contador+1;
            }
            else if (n==aleatorio)
            {
                System.out.println("¡Felicidades! Adivinaste el número en "+ contador+" intentos");
                contador=contador+1;
                esPrimo=false;
            }
        }

    }
}
