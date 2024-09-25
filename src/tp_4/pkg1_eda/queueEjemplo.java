
package tp_4.pkg1_eda;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Joaco
 */
public class queueEjemplo {
    
    // Cola de ejemplo usando LinkedList
    private Queue<Integer> fila;

    // Constructor de la clase que inicializa la cola
    public queueEjemplo() {
        fila = new LinkedList<>();
    }

    // Método para insertar un elemento en la cola
    public void insertar(int elemento) {
        fila.add(elemento);
        System.out.println("Elemento " + elemento + " insertado en la fila.");
    }

    // Método para eliminar un elemento de la cola
    public void suprimir() {
        if (fila.isEmpty()) {
            System.out.println("La fila está vacía, no hay elementos para suprimir.");
        } else {
            int eliminado = fila.poll(); // poll() elimina y devuelve el primer elemento
            System.out.println("Elemento " + eliminado + " suprimido de la fila.");
        }
    }

    // Método para mostrar todos los elementos en la cola
    public void mostrarElementos() {
        if (fila.isEmpty()) {
            System.out.println("La fila está vacía.");
        } else {
            System.out.println("Elementos en la fila: " + fila);
        }
    }

public static void Invertir(Queue<Integer> filaC) {
        if (filaC.isEmpty()) {
            return; // Caso base: si la fila está vacía, no hay nada que invertir
        }

        // Sacamos el primer elemento de la fila
        int primerE = filaC.poll();

        // Llamada recursiva para invertir el resto de la fila
        Invertir(filaC);

        // Al final, volvemos a agregar el elemento extraído al final de la fila
        filaC.add(primerE);
    }

    // Método que elimina los elementos consecutivos repetidos de la fila
    public static Queue<Character> eliminarRepetidosConsecutivos(Queue<Character> filaOriginal) {
        Queue<Character> filaResultante = new LinkedList<>(); // Nueva fila sin repetidos

        if (filaOriginal.isEmpty()) {
            return filaResultante; // Si la fila está vacía, devolvemos una fila vacía
        }

        // Obtenemos el primer elemento de la fila original
        char elementoAnterior = filaOriginal.poll();
        filaResultante.add(elementoAnterior); // Lo agregamos a la fila resultante

        // Recorremos el resto de los elementos de la fila original
        while (!filaOriginal.isEmpty()) {
            char elementoActual = filaOriginal.poll(); // Eliminamos y obtenemos el primer elemento

            // Si el elemento actual es diferente del anterior, lo agregamos a la nueva fila
            if (elementoActual != elementoAnterior) {
                filaResultante.add(elementoActual);
            }

            // Actualizamos el valor del elemento anterior
            elementoAnterior = elementoActual;
        }

        return filaResultante; // Devolvemos la nueva fila sin repetidos
    }
}
