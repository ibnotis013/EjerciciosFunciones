package ejercicio5;

public class validador {
}

public static boolean esPasswordSegura(String pass){
    if(pass.length()<8){
        return true;
    }
    else {
        return false;
    }
}

