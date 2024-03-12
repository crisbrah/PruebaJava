import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Preg06 {
    public static void main(String[] args) {
        //Escriba un programa que reciba un valor n, que será el tamaño de un array que se
        // inicializará y llenará. Posteriormente, ordene el array de menor a mayor.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numeros.add((int)(Math.random()* 100) + 1);

        }
        System.out.println(numeros);
        System.out.println("El Array en orden sera: ");

        Collections.sort(numeros);
        System.out.println(numeros);

    }
}
