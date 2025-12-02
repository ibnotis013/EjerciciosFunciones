package ejercicio6;

import java.util.Scanner;

public class TaquillaTeatro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String opcion;
        char[][] teatro = new char[5][5];
        GestorSala.inicializarMatriz(teatro);



        do {
            System.out.println("seleccione una opcion\n" +
                    "1 ver sala\n" +
                    "2 reservar butaca\n" +
                    "3 salir");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    GestorSala.MostrarSala(teatro);
                    break;

                case "2":
                    System.out.println("introduce en que fila quieres reservar");
                    int fila = sc.nextInt();
                    System.out.println("introduce en que columna quieres reservar");
                    int columna = sc.nextInt();
                    GestorSala.reservarAsiento(teatro, fila, columna);
                    break;

            default:
                System.out.println("opcion incorrecta");
                break;
        }
        }while(!opcion.equals("3"));
    }
}
