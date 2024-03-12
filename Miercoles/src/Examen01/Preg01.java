package Examen01;

import java.util.Scanner;


public class Preg01 {
    public static void main(String[] args) {
        //Ingrese un valor n y calcule la suma de los primeros n números naturales.
        // Excepto números multiplos de 3 y 5
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num1= sc.nextInt();
        int suma=0;
        for (int i=num1; i>=0; i--)
        {
            if(i%3==0 || i%5==0)
            {

            }
            else {
                suma=suma+i;
                System.out.println(suma);
            }

        }
        System.out.println("la suma es "+suma);
    }
}
