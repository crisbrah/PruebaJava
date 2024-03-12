package Arrays;
import java.util.Scanner;
public class Ejer08 {
    public static void main(String[] args) {
        int[] numeros=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("ingrese el valor "+i+" :");
            numeros[i]= scanner.nextInt();
        }

        System.out.println("imprimiendo de manera inversa ");
        for(int i=9;i>=0;i--)
        {
            System.out.println(numeros[i]);
        }
 }
}
