package ejercicio6;

public class gestorSala {


    public static void inicializarMatriz (char[][] sala){
        for(int i=0;i<sala.length;i++){
            for(int j=0;j<sala[i].length;j++){
               sala[i][j]='L';
            }
        }
    }

    public static void MostrarSala(char[][] sala){
        for(int i=0;i<sala.length;i++){
            System.out.print(sala[i]);
            for(int j=0;j<sala[i].length;j++){
                System.out.println(sala[i][j]);
            }
        }

    }

    public static boolean reservarAsiento (char[][] sala,int fila,int columna){
        if(sala[fila][columna]>sala.length){
        return false;

        }
        else if(sala[fila][columna]=='X'){
            return false;
        } else if (sala[fila][columna]=='L') {
            sala[fila][columna]='X';
            return true;
        }
    }





}
