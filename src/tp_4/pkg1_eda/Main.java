
package tp_4.pkg1_eda;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Joaco
 */
public class Main {

    public static void main(String[] args) {
        
        queueEjemplo queue = new queueEjemplo();

        Queue<Integer> filaC = new LinkedList<>();
        
//        // Insertar elementos en la fila
//        queue.insertar(10);
//        queue.insertar(20);
//        queue.insertar(30);
//
//        // Mostrar elementos de la fila
//        queue.mostrarElementos();
//
//        // Suprimir elementos de la fila
//        queue.suprimir();
//        queue.mostrarElementos();
//
//        queue.suprimir();
//        queue.mostrarElementos();
//
//        // Intentar suprimir más elementos de los que hay
//        queue.suprimir();
//        queue.suprimir(); // Aquí la fila ya está vacía
//
//        
//        filaC.add(1);
//        filaC.add(2);
//        filaC.add(3);
//        filaC.add(4);
//        filaC.add(5);
//
//        // Imprimimos la fila original
//        System.out.println("Fila original: " + filaC);
//
//        // Invertimos la fila
//        queue.Invertir(filaC);
//
//        // Imprimimos la fila invertida
//        System.out.println("Fila invertida: " + filaC);
        
        
        // Creamos una fila original con elementos repetidos consecutivos
        Queue<Character> filaOriginal = new LinkedList<>();
        filaOriginal.add('A');
        filaOriginal.add('A');
        filaOriginal.add('B');
        filaOriginal.add('B');
        filaOriginal.add('B');
        filaOriginal.add('C');
        filaOriginal.add('A');
        filaOriginal.add('C');
        filaOriginal.add('C');
        filaOriginal.add('D');

        // Mostramos la fila original
        System.out.println("Fila original: " + filaOriginal);

        // Eliminamos los repetidos consecutivos
        Queue<Character> filaResultante = queue.eliminarRepetidosConsecutivos(filaOriginal);

        // Mostramos la fila resultante
        System.out.println("Fila resultante (sin repetidos consecutivos): " + filaResultante);
    }
        
    }
    

