# Librería Propia

---

## Salida

Posibilidad de imprimir por consola o en una ventana

## Apuntes
Metodo min devuelve algo (x lo menos un boolean). Digo esto por 
ejemplo que devuelva el error si el metodo falla y para eso tengo 
que devolver un boolean si lo quiero hacer correcto.
---------
**03/02**

## Metodos
### Atributos
````java
boolean isOK_ventana = false; // *1
````
*1 para que puso dalse aqui si luego lo cambia??

Recibe String 03/02
````java
static String entradaString(String comentario){ // *1
        Scanner myObj = new Scanner(System.in); *2
        System.out.println(comentario); 
        String data = myObj.nextLine(); // Read user input
        // respuesta.respuestaString = data;
        return data;
    }
````
*1 Si quisiera cambiar el nombre del metodo lo hago con refactor
(selecciono caracteres; click derecho; refactor)
porque se aplicaria en todo el documento.

*2 dentro para que cuando se acabe el metodo se muera

### Main
````java
// saco por consola la String recibida
isOK_consola = EntradaSalida.salida(nombre, EntradaSalida.SALIDA_CONSOLA); // *1
if (!isOK_consola) System.out.println("ERROR CONSOLA"); // *2
````
*1 habria que poner lo de isOk_consola no??? PREGUNTAR DAMIAN
*
*2 habria que poner esto no?? PREGUNTAR DAMIAN