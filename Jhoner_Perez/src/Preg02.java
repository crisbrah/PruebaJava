import java.util.ArrayList;
import java.util.Scanner;

public class Preg02 {
    public static void main(String[] args) {
        //Ingrese un valor n que sera el tamaño de un arreglo. Llene el arreglo con
        // números aleatorios entre 1 y 100. Luego, imprima el arreglo con la
        // suma de sus elementos. Excepto números multiplos de 3 y 5.
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n= sc.nextInt();
        int suma=0;
        for (int i = 0; i < n; i++) {
            numeros.add((int)(Math.random()* 100) + 1);
            if(numeros.get(i)%3==0 || numeros.get(i)%5==0)
            {            }
            else {
                suma=suma+numeros.get(i);
            }
        }

        System.out.println(numeros);
        System.out.println("LA SUMA TOTAL ES: "+suma);
    }
}
