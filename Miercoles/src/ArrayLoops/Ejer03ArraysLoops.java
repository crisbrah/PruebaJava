package ArrayLoops;

public class Ejer03ArraysLoops {
    public static void main(String[] args) {
        //Imprimir los numeros pares del 1 al 100.
        int num=1;
        while (num<=100) {
            if (num%2==0)
            { System.out.println(num);}
            num=num+1;
        }
    }
}
