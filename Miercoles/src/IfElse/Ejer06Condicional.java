package IfElse;

import java.util.Scanner;

public class Ejer06Condicional {

    public static void main(String[] args) {
/*Escriba un programa que determine la elegibilidad para la admision a un programa universitario basado en el siguiente criterio:

        Nota en matemáticas mayor o igual a 65.
        Nota en física mayor o igual a 55.
        Nota en química mayor o igual a 50.
        O el total de las notas en física y matemáticas debe ser mayor o igual a 140.
        El programa debe imprimir "Admitido" si el estudiante cumple con los requisitos, en caso contrario, debe imprimir "No admitido".
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la nota de matematica: ");
        int nota1= sc.nextInt();
        System.out.println("ingrese la nota de física: ");
        int nota2= sc.nextInt();
        System.out.println("ingrese la nota de química: ");
        int nota3= sc.nextInt();

        if (nota1>=65&&nota2>=55&&nota3>=508 || nota1+nota2>=140){
            System.out.println("Admitido");
        }
        else {
            System.out.println("NO Admitido");
        }



    }
}
