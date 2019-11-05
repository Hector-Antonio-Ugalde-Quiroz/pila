/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas.y.filas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Opcion, a;
        int pila[] = new int[10];
        pila objpilaEnteros = new pila(pila);
        //Agregarmos elementos a la pila de datos
        //el fondo de la pila seria 90 y la cima 12
//        objpilaEnteros.insertar(90);
//        objpilaEnteros.insertar(56);
//        objpilaEnteros.insertar(23);
//        objpilaEnteros.insertar(12);
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Insertar Numero\n"
                    + "2. Eliminar\n"
                    + "3. Observar\n"
                    + "4. Cima\n"
                    + "5. Fondo\n"
                    + "6. SALIR\n"
                    + "--------------------------------------------------------\n"
                    + "INGRESE LA OPCION [1 - 6]", "MENU COLA", JOptionPane.QUESTION_MESSAGE));

            switch (Opcion) {
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un Numero"));
                    objpilaEnteros.insertar(a);
                    break;
                case 2:
                    objpilaEnteros.retirar();
                    break;
                case 3:
                    objpilaEnteros.mostrarpila();
                    break;
                case 4:
                    objpilaEnteros.cima();
                    break;
                case 5:
                    objpilaEnteros.fondo();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA \n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}
