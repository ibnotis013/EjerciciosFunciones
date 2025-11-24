package ejercicio3;

public class gestorentradas {
private static final double PRECIO=10.0;
public static double precio(){
return PRECIO;
}
public static double preciofinal(int edad, boolean esDiaEspectador){
    if(edad>65){
        return PRECIO*0.5;
    }
    else if (esDiaEspectador){
        return PRECIO*0.8;
    }
    else{
        return PRECIO;
    }
}
public static void  imprimir(String pelicula,int butaca, double precio){
    System.out.println("---------------------------------");
    System.out.println(pelicula);
    System.out.println(butaca);
    System.out.println(precio);
    System.out.println("---------------------------------");
}


}
