package ArrayLoops;//Ejercicio 6 ArraysLoops

public class Ejer06to10ArrayLoops
{
    public static void main(String[] args) {
        for (int i=1; i<=100; i+=1)
        {
            if (i%3==0 || i%5==0) continue;
            System.out.println(i);
        }
    }

}



/*public class Arrays7 {
    public static void main(String[] args) {
        int length = 10;
        int[] elements = new int[length];

        // agregamos al arreglo los numeros del 1 al 10
        for (int i=0; i<length; i+=1) {
            elements[i] = i + 1;
        }

        // imprimimos los valores del arreglo
        for (int i=0; i<length; i+=1)
        {
            System.out.println(elements[i]);
        }
    }
}
Ejercicio 8 ArraysLoops

public class Arrays8 {
    public static void main(String[] args) {
        int length = 10;
        int[] elements = new int[length];

        // agregamos al arreglo los numeros del 1 al 10
        for (int i=0; i<length; i+=1) {
            elements[i] = i + 1;
        }

        // imprimimos los valores del arreglo
        for (int i=length; i>0; i-=1)
        {
            System.out.println(elements[i - 1]);
        }
    }
}
Ejercicio 9 ArraysLoops

public class Arrays9 {
    public static void main(String[] args) {
        int length = 10;
        int[] elements = new int[length];

        // agregamos al arreglo los numeros del 1 al 10
        for (int i=0; i<length; i+=1) {
            elements[i] = i + 1;
        }

        int sumElements = 0;

        for (int i=0; i<length; i+=1) {
            sumElements += elements[i];
        }

        System.out.println("El arreglo es " + Arrays.toString(elements));
        System.out.println("La suma de los valores es " + sumElements);
    }
}
Ejercicio 10 ArraysLoops

public class Arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de 'n': ");
        int length = sc.nextInt();

        int [] elements = new int[length];

        Random rd = new Random();

        // agregamos los valores aleatorios en el arreglo
        for (int i=0; i<length; i++) {
            elements[i] = rd.nextInt(100);
        }

        int higherValue = elements[0];

        for (int i=1; i<length; i++) {
            if (elements[i] > higherValue) higherValue = elements[i];
        }

        System.out.println("El arreglo generado con 'n' elementos es: " + Arrays.toString(elements));
        System.out.println("El mayor de los elementos es: " + higherValue);
    }
}
*/
