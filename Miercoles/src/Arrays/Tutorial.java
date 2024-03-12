package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Tutorial
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese edad");
        int[] valores= new int [5];
        int[] valores2={2,3,44,55,12};

        valores[2]=1110;
        valores[4]=500;

        int tamano=valores.length;
        System.out.println(tamano);

//imprimir lista
        System.out.println(valores2[2]);
        System.out.println(valores[1]);

        //declarar lista

        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Jhoner");

        nombres.remove("Juan");
        System.out.println("imprimiendo valores del array valores2");
        int tamano2=valores2.length;
        for(int i=0;i<tamano2;i++){
            System.out.println(valores2[i]);
        }



    }
}
