public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false; // para que puso dalse aqui si luego lo cambia??
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA); /* por eso es cte, porque quiero
        que el usuario cuando ponga el puntito le aparezca esas opciones*/
        if (!isOK_consola) System.out.println("ERROR CONSOLA"); // de esta forma nunca va a imprimir esto no?
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");;

        // 03/02/23
        // pregunto por una string
        String nombre = EntradaSalida.entradaString("Cual es tu nombre?");
        // saco por consola la String recibida
        isOK_consola = EntradaSalida.salida(nombre, EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
    }
}