import java.util.List;
//Se que puedo hacerlo mas elegante poniendo scanner y hacíendo un logaritmo que te pida el numero de elementos
// de la cola inicial o los elementos iniciales y los que quieres introducir después.
//Pero me he centrado en lo que pedía el ejercicio y ya, lo otro lo tengo más claro y
// no me quiero complicar en esa parte del código.
public class Main {
public static void main(String[] args) {
        Cola c1 = new Cola();
        c1.insertarFinal(1);
        c1.insertarFinal(2);
        c1.insertarFinal(3);
        c1.mostrar();
        c1.insertar(4);
        c1.mostrar();
        c1.eliminar(0);
        c1.mostrar();
        c1.mostratPyU();
     }
}