package ejercicio1;

public class pincipal2 {


    private static final double DOLAR_VALOR=1.5;
    private static final double EURO_VALOR=0.9;
    public static void MostrarTasasDeCambio(){
        System.out.println("la tasa de cambio es 1 credito="+DOLAR_VALOR+" y 1 credito="+EURO_VALOR);
    }
    public static double dolaresacreditos(double dolares){
        return dolares/DOLAR_VALOR;
    }
    public static double eurosacreditos(double euros){
        return euros/EURO_VALOR;
    }
    public static boolean validarcompra(double precio, double saldo){
    return   precio>=saldo;
    }

}
