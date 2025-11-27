package ejercicio5;

import java.util.Locale;

public class validador {

    public static boolean esPasswordSegura(String pass){
        if(pass.length()>=8){
            return true;
        }
        else {
            return false;
        }
    }

    public static String formatearnombre(String nombre){
        if(nombre==null || nombre.isEmpty()){
            return nombre;
        }
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }


    public static boolean esEmailValido(String email){
        if(email.contains("@")){
            return true;
        }
        return false;
    }


    public static void mostrarErrores (){
        System.out.println("la contraseña tiene que tener 8 o mas caracteres");
    }





}



