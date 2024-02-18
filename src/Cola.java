import java.util.Arrays;

public class Cola {
    //Atributos de la clase
    Integer[] elemento;
    int primero;
    int ultimo;
    //Especificació (?) No tengo claro si en este ejercicio se debería hacer así o no.
    public Cola(){
    elemento = new Integer[0];
    }
    void insertarFinal(Integer nuevo){
        elemento = Arrays.copyOf(elemento,elemento.length +1);
        elemento[elemento.length-1] = nuevo;
    }
    void insertarFinal(Cola otraCola){
        int tamIni = elemento.length; //Tamaño inicial de la cola
        elemento = Arrays.copyOf(elemento,elemento.length + otraCola.elemento.length);
        System.arraycopy(otraCola.elemento, 0, elemento, tamIni, otraCola.elemento.length);
    }
    //Insertar parametros al final y expandir la tabla.
    void insertar (Integer nuevo){
        elemento=Arrays.copyOf(elemento,elemento.length+1);
        elemento[elemento.length-1] = nuevo; //Se inserta el valor en el último número,
        // por lo que los indices empiezan en 0 debe ser 1 valor menor que la longitud del array.
    }
    //Se  elimina el valor 0 y se devuelve la tabla
    Integer eliminar(int primero){
        Integer eliminado = null;
        if (primero >= 0 && primero < elemento.length){
            eliminado = elemento[primero];
            for( int i = primero + 1; i< elemento.length; i++){
                elemento[i-1] = elemento[i];
            }
            elemento = Arrays.copyOf(elemento,elemento.length-1);
        }
        return eliminado;
    }
    // Le pasaremos el primero y nos devolvera el elemento sin modificar la cola.
    //En caso que el número no sea válido, devolveremos null, para evitar que el programa aborte.
    Integer get(int primero){
        Integer resultado = null;
        if(primero>=0&& primero< elemento.length){
            //Primero = válido
            resultado = elemento[primero];
        }
        return resultado;
    }
    //Num de elementos
    public int numElementos(){
        return elemento.length;
    }
    //Mostrar cola por consola
    public void mostrar(){
        System.out.println("Cola: " + Arrays.toString(elemento));
    }
    public void mostratPyU(){
        System.out.println("El primero es: " + elemento[0]);
        System.out.println("El último es: " + elemento[elemento.length-1]);
    }
}
//-----------------------------------
//Inspirats en exercici resolt 7.11  i 7.12

//Coses que millorar:
//Eliminar --> elimine directamente el primero
//Mostrar primero y ultimo --> OK

