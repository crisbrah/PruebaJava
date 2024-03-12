import java.util.ArrayList;
import java.util.Scanner;

public class Preg03 {
    public static void main(String[] args) {
        //Un número primo es un número natural mayor que 1 que tiene únicamente
        // dos divisores distintos: él mismo y el 1. Escriba un programa que
        // reciba un número n e imprima si es primo o no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número mayor a 1: ");
        boolean esPrimo = true;
        int n = sc.nextInt();

        if (n <= 1)
                {  esPrimo = false; }
        else    {
                    int i = 2;
                    while (i <= n / 2)
                    {
                        if (n % i == 0)
                            {  esPrimo = false;  }
                        i++;
                    }
                }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}