/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.PatronSingletonImpresora;

/**
 *
 * @author paula
 */
// Clase principal que prueba la funcionalidad de la impresora Singleton
public class App {
    public static void main(String[] args) {
        // Obtener la única instancia de la impresora
        ImpresoraInterface impresora1 = Impresora.getInstancia();
        impresora1.imprimirDocumento("Reporte Anual.pdf");

        // Obtener la misma instancia en otra variable
        ImpresoraInterface impresora2 = Impresora.getInstancia();
        impresora2.imprimirDocumento("Contrato.docx");

        // Verificar si ambas referencias apuntan a la misma instancia (debe ser true)
        System.out.println("Es la misma impresora? " + (impresora1 == impresora2));

        // Mostrar el total de impresiones realizadas
        impresora1.mostrarTotalImpresiones();
    }
}