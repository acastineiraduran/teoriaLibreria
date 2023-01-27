import com.sun.security.jgss.GSSUtil;

import javax.swing.*;

public class EntradaSalida {

    static final int SALIDA_CONSOLA = 1; // no va a variar
    static final int SALIDA_WINDOW = 2;

    /**
     * Salida por ventana o consala de un mensaje
     * @param msj cadena que queremos imprimir
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
                    JOptionPane.showMessageDialog(null,"Sale por un ventana " + msj.toCharArray()[10]);
                    return true;
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                // break; // me da error porque siempre me va a salir despues del return
            default:
                return false;
        }
    }

    static String entrada(String comentario){
        return "";
    }
}
