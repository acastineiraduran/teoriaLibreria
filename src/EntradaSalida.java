import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class EntradaSalida {

    static final int SALIDA_CONSOLA = 1; // no va a variar
    static final int SALIDA_WINDOW = 2;



    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param msj    cadena que queremos imprimir
     * @param device dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_VENTANA)
     * @return si es true: correcto si no false
     */
    static boolean salida(String msj, int device) { // metodo siempre devuelve algo (minimo un boolean)
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false; // no se pone el break porque el return ya me saca
                }

            case SALIDA_WINDOW:
                try { // meto todo lo que sea sensible de que me rompa
                    JOptionPane.showMessageDialog(null, "Sale por un ventana " + msj.toCharArray()[10]);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                // break; // me da error porque siempre me va a salir despues del return
            default:
                return false;
        }
    }

    /* Crear 2 metodos:
    1. Recibe String.
    mensaje que el usuario
    devuelve una string
    2. Recibe una string (mensaje
    devuelve un entero.

     */


    //02/02/23
    static String entradaString(String comentario){
        Scanner myObj = new Scanner(System.in);
        System.out.println(comentario);
        String data = myObj.nextLine(); // Read user input
        return data;
    }

    static int entradaEntero(String comentario){
        Scanner myObj = new Scanner(System.in);
        System.out.println(comentario);
        int entero = myObj.nextInt();
        return entero;
    }

    //08/02/23
    static String entradaString2(String comentario){
        Scanner myObj = new Scanner(System.in);
        System.out.println(comentario);
        try {
            String respuesta = myObj.nextLine();
            return respuesta;
        } catch(Exception e) {
            return null; // mensaje para programador
        }
    }

    static Integer entradaInt2(String comentario){ // tengo que poner en esa clase para que admita el null
        Scanner myObj = new Scanner(System.in);
            System.out.println(comentario);
        try {
            Integer respuesta = myObj.nextInt();
            return respuesta;
        } catch(Exception e) {
            return null;
        }
    }

    static Float entradaFloat(String comentario){
        Scanner myObj = new Scanner(System.in);
        System.out.println(comentario);
        try {
            Float respuesta = myObj.nextFloat();
            return respuesta;
        } catch(Exception e) {
            return null;
        }
    }

}
