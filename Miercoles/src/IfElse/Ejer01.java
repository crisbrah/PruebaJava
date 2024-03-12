package IfElse;

import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {
//Para un número entero n, determinar si es par o impar. En caso de ser par, imprimir "Par", en caso contrario, imprimir "Impar".
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese Numero ");
        int num= sc.nextInt();
        if(num%2==0)
            {
                System.out.println("es par");
            }
        else {
            System.out.println("es impar");        }
    }
}
