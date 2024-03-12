package Arrays;
import java.util.Scanner;
public class Ejer09 {
    public static void main(String[] args) {
//Declarar un arreglo de 10 elementos e imprimir la suma de sus valores.
        int[] num1=new int[10];
        Scanner sc=new Scanner(System.in);
        int suma=0;
        for(int i=0;i<10;i++){
            System.out.println("Ingrese los valores "+i+" :");
            num1[i]=sc.nextInt();
            suma=num1[i]+suma;
        }
        System.out.println("la suma es "+suma);


    }
}
