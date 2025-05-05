/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.PatronSingletonImpresora;

/**
 *
 * @author paula
 */
// Interfaz que define los métodos que toda impresora debe implementar
public interface ImpresoraInterface {
    void imprimirDocumento(String documento); // Método para imprimir un documento
    void mostrarTotalImpresiones(); // Método para mostrar el número total de impresiones
}

