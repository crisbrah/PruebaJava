import java.util.Scanner;
public class preg20 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt(); // Número de días
            int m = scanner.nextInt(); // Capacidad de deseos por página
            int[] deseosPorDia = new int[n]; // Deseos escritos por día

            // Leer los deseos escritos por día
            for (int i = 0; i < n; i++) {
                deseosPorDia[i] = scanner.nextInt();
            }

            // Calcular cuántas veces pasamos de página cada día
            int paginaActual = 1; // Comenzamos en la primera página
            int pasadasDePagina = 0; // Contador de pasadas de página

            for (int i = 0; i < n; i++) {
                int deseosHoy = deseosPorDia[i];

                // Verificar si la página actual puede contener al menos un deseo
                while (deseosHoy > 0) {
                    if (paginaActual > m) {
                        pasadasDePagina++;
                        paginaActual = 1; // Comenzar en la siguiente página
                    }
                    deseosHoy--;
                    paginaActual++;
                }
            }

            System.out.println(pasadasDePagina);
        }
    }

