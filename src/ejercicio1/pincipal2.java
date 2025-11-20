package ejercicio1;

public class pincipal2 {



    public static void MostrarTasasDeCambio(){
        System.out.println("la tasa de cambio es 1 credito=1.5 dolares y 1 credito=0.9€");
    }
    public static double dolaresacreditos(double dolares){
        return dolares/1.5;
    }
    public static double eurosacreditos(double euros){
        return euros/0.9;
    }
    public static boolean validarcompra(double precio, double saldo){
    if (precio > saldo){
        return false;
    }
    else {
        return true;
    }
    }

}
