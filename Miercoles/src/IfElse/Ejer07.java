package IfElse;

import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {
        /*
        Si la temperatura es menor a 0, mostrar "Congelado".
Temperatura entre 0 y 10, mostrar "Muy frío".
Temperatura entre 11 y 20, mostrar "Frío".
Temperatura entre 21 y 30, mostrar "Normal".
Temperatura entre 31 y 40, mostrar "Caliente".
Temperatura mayor a 40, mostrar "Muy caliente".
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la temperatura ");
        int temp1= sc.nextInt();
        if (temp1<0){
            System.out.println("congelando");}

            else if (temp1>=0||temp1<11)
            {
                System.out.println("muy frio");
            }



    }
}
