/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PatronSingletonImpresora;

/**
 *
 * @author paula
 */
// Clase que representa una impresora, implementando el patrón Singleton
public class Impresora implements ImpresoraInterface {
    // Variable estática para almacenar la única instancia de la clase
    private static volatile Impresora instancia;

    // Contador para llevar el registro del total de impresiones realizadas
    private int totalImpresiones;

    // Constructor privado para evitar la creación de múltiples instancias
    private Impresora() {
        this.totalImpresiones = 0; // Inicializa el contador de impresiones en 0
    }

    // Método estático para obtener la única instancia de la impresora (Singleton)
    public static Impresora getInstancia() {
        if (instancia == null) { // Primera verificación para mejorar el rendimiento
            synchronized (Impresora.class) { // Bloqueo para evitar problemas en entornos multi-hilo
                if (instancia == null) { // Segunda verificación para asegurar que solo se crea una vez
                    instancia = new Impresora();
                }
            }
        }
        return instancia;
    }

    // Implementación del método de la interfaz para imprimir un documento
    @Override
    public void imprimirDocumento(String documento) {
        totalImpresiones++; // Aumenta el contador de impresiones
        System.out.println(" Imprimiendo: " + documento);
    }

    // Implementación del método de la interfaz para mostrar el total de impresiones
    @Override
    public void mostrarTotalImpresiones() {
        System.out.println("️ Total de impresiones realizadas: " + totalImpresiones);
    }
}

