package ejercicio3;

import java.util.Scanner;

public class tanquilla {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una peli");
        String peli=sc.nextLine();
        System.out.println("introduce tu edad");
        int edad=sc.nextInt();
        System.out.println("es el dia del espectador True/false ?");
        boolean diaEspectador=sc.nextBoolean();
        System.out.println("el precio seria "+gestorentradas.preciofinal(edad,diaEspectador));
       gestorentradas.imprimir(peli,13,gestorentradas.preciofinal(edad,diaEspectador));
        }





        }


