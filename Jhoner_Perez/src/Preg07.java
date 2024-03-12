import java.util.Scanner;
public class Preg07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los días que se tiene que escribir:");
        int dias = sc.nextInt();
        System.out.println("Ingresa la capacidad de deseos por dia:");
        int capacidad = sc.nextInt();
        //Declarando variables
        int[] arreglo = new int[dias];
        int[] volteadoPaginas = new int[dias];
        int[] temporal = new int[dias];
        for (int i = 0; i < dias; i++) {
            System.out.println("Ingrese el numero de deseos por el dia: " + (i + 1));
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < dias; i++) {
            if(i == 0)
            {
                temporal[i] = arreglo[i] % capacidad;
                if(arreglo[i] < capacidad)
                {
                    volteadoPaginas[i] = 0;
                }
                else if(arreglo[i] == capacidad)
                {
                    volteadoPaginas[i] = 1;
                }
                else
                {
                    volteadoPaginas[i] = arreglo[i]/capacidad;
                }
            }
            else
            {
                int temp = arreglo[i] + temporal[i - 1] % capacidad;
                temporal[i] = temp;
                if(temp < capacidad)
                {
                    volteadoPaginas[i] = 0;
                }
                else if(temp == capacidad)
                {
                    volteadoPaginas[i] = 1;
                }
                else
                {
                    volteadoPaginas[i] = temp/capacidad;
                }
            }
        }
        for (int i = 0; i < volteadoPaginas.length; i++) {
            System.out.println(volteadoPaginas[i]+" pasada(s) de hoja");
        }
    }

}
