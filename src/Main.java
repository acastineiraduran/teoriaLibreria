public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA); /* por eso es cte, porque quiero
        que el usuario cuando ponga el puntito le aparezca esas opciones*/
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");
    }
}