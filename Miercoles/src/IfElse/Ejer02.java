package IfElse;

import java.util.Scanner;
public class Ejer02 {
    public static void main(String[] args) {
        //Para un número entero n, determinar si es positivo, negativo o cero. En caso de ser positivo, imprimir "Positivo", en caso de ser negativo, imprimir "Negativo", en caso de ser cero, imprimir "Cero".
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero: ");
        int num= sc.nextInt();
        if (num>0)
        {
            System.out.println("es positivo");
        } else if (num==0) {
            System.out.println("es 0");
        }
        else
        {
            System.out.println("es negativo");
        }
    }
}
