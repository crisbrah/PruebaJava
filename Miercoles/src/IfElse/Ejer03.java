package IfElse;



import java.util.Scanner;
public class Ejer03 {
    public static void main(String[] args) {
//Para un número entero n, determinar si es múltiplo de 3 o de 5. En caso de ser múltiplo de 3, imprimir "Múltiplo de 3", en caso de ser múltiplo de 5, imprimir "Múltiplo de 5", en caso de ser múltiplo de ambos, imprimir "Múltiplo de 3 y 5", en caso de no ser múltiplo de ninguno, imprimir "No es múltiplo de 3 ni de 5".
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese numero: ");
        int num= sc.nextInt();
        if (num%3==0&&num%5==0)
        {
            System.out.println("es multiplo de 3 y 5");
        } else if (num%3==0) {

            System.out.println("es multiplo de 3");
        }
        else if (num%5==0)
        {
            System.out.println("es multiplo de 5");
        }

    }

    }


