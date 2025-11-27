package ejercicio5;

import java.util.Scanner;

public class registrousuario {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String password;

        System.out.println("ingrese el nombre de usuario");
        String nombre = sc.nextLine();
        System.out.println("ingrese un email");
        String email = sc.nextLine();
        do {
            System.out.println("ingrese la contraseña");
            password = sc.next();
            if (!validador.esPasswordSegura(password)) {
                validador.mostrarErrores();
            }

        }while(!validador.esPasswordSegura(password));



        System.out.println("Registro completado: Usuario: "+validador.formatearnombre(nombre)+" Registrado con email "+email);

    }
}
