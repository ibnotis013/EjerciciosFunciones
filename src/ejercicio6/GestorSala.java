package ejercicio6;

public class GestorSala {




    public static void inicializarMatriz (char[][] sala){
        for(int i=0;i<sala.length;i++){
            for(int j=0;j<sala[i].length;j++){
                sala[i][j]='L';
            }
        }
    }

    public static void MostrarSala(char[][] sala){
        for(int i=0;i<sala.length;i++){
            for(int j=0;j<sala[i].length;j++){
                System.out.print(sala[i][j]);
            }
            System.out.println();
        }

    }

    public static boolean reservarAsiento (char[][] sala,int fila,int columna){

        if(fila<0||fila>sala.length||columna>sala[0].length||columna<0){
            System.out.println("error, asiento ocupado o coordenadas incorrectas");
            return false;
        }
      else if(sala[fila][columna]=='X'){
          System.out.print("error, asiento ocupado o coordenadas incorrectas");
          return false;
        } else if (sala[fila][columna]=='L') {
            sala[fila][columna]='X';
          System.out.print("asiento reservado con exito");

          return true;
        }
        return  false;
    }





}
