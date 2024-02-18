import java.util.List;
//Se que puedo hacerlo mas elegante poniendo scanner y hacíendo un logaritmo que te pida el numero de elementos
// de la cola inicial o los elementos iniciales y los que quieres introducir después.
//Pero me he centrado en lo que pedía el ejercicio y ya, lo otro lo tengo más claro y
// no me quiero complicar en esa parte del código.
public class Main {
public static void main(String[] args) {
        Cola c1 = new Cola();
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c1.mostrar();
        c1.insertar(4);
        c1.mostrar();
        c1.eliminar();
        c1.mostrar();
        c1.mostratPyU();
        System.out.println("El largo de la cola es de: " + c1.numElementos());
     }
}