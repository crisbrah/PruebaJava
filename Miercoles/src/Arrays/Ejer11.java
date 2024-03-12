package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numeros= new ArrayList<>();

        System.out.println("INGRESE LA CANTIDD D ELEMENTOS ");
        int n= sc.nextInt();

        for (int i=0; i<n; i++)
        {
            numeros.add((int)(Math.random()*100)+1);
        }
        System.out.println(numeros);
        System.out.println("ingrese el valor a buscar ");
        int buscar=sc.nextInt();
        Collections.sort(numeros);

        int index=Collections.binarySearch(numeros,buscar);
        System.out.println(index);

        if(index>=0) {
            System.out.println(numeros.get(index));
        }
        else
        {
            System.out.println("valor no existe");
        }
    }
}
