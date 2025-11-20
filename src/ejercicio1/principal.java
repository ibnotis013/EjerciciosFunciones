package ejercicio1;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("las tasas son ");
        pincipal2.MostrarTasasDeCambio();
        System.out.println("ingrese las pelas");
        double euros = sc.nextDouble();
        double  creditos= pincipal2.eurosacreditos(euros);
        double saldo=creditos;
        double precio=500;
        System.out.println(creditos);
        System.out.println("intentas compara una nave 500 creditos");

        if(pincipal2.validarcompra(precio, saldo)==true){
            System.out.println("la compra se ha realizado");
            saldo=saldo-precio;
        }

        else{
            System.out.println("la compra no se ha realizado, dinero insuficiente");
        }
        System.out.println("el dinero que te queda es "+saldo);
    }
}
