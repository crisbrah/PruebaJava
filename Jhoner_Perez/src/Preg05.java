import java.util.ArrayList;
import java.util.Scanner;

public class Preg05 {
    public static void main(String[] args) {
        //Escriba un programa que reciba un valor n, que será el tamaño de un array que se inicializará y llenará.
        // Posteriormente, invierta el array (sin usar el metodo inverse de Collections)
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numeros.add((int)(Math.random()* 100) + 1);

        }
        System.out.println(numeros);
        System.out.println("el orden inverso es: ");
        for (int j = n-1; j >= 0; j--) {
            System.out.println(numeros.get(j));
        }


    }
}
