package ejercicio3;

public class gestorentradas {

public static double precio(){
return 10;
}
public static double preciofinal(int edad, boolean esDiaEspectador){
    if(esDiaEspectador){
        return precio()%20;
    }
    else if (edad>65){
        return precio()%50;
    }
    else{
        return precio();
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
