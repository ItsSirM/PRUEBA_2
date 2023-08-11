/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaa;

/**
 *
 * @author AdminColeexz
 */
public interface JuegoAhorcado {
    
    String palabraSecreta();
    String palabraActual();
    int intentos();
    
    void inicializarPalabraSecreta();
    void jugar();
    
}
